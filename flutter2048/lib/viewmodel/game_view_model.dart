import 'dart:math';
import 'package:flutter/material.dart';

import '/model/game.dart';


class GameViewModel extends ChangeNotifier {
  Game _game = Game(size: 4);
  bool _showGameOver = false;
  bool _showedClear = false;
  bool _showClear = false;
  bool _edited = false;
  ThemeMode? _themeMode;

  List<List<Tile>> get board => _game.board;
  int get size => _game.size;
  int get max => _game.max;
  int get score => _game.score;
  bool get free => _game.free;
  bool get playable => _game.playable;
  bool get showClear {
    final tmp = _showClear;
    _showClear = false;
    return tmp;
  }
  bool get showGameOver {
    final tmp = _showGameOver;
    _showGameOver = false;
    return tmp;
  }
  bool get edited => _edited;
  ThemeMode get themeMode => _themeMode ?? ThemeMode.light;

  void playNewGame({ int size = 4 }) {
    _game = Game(size: size);
    _showedClear = false;
    _edited = false;
    notifyListeners();
  }

  void autoProcess() {
    final (ableUp, ableDown, ableLeft, ableRight) = (able(Direction.up), able(Direction.down), able(Direction.left), able(Direction.right));
    if (ableUp || ableDown || ableLeft || ableRight) {
      final List<Direction> directions = [];
      if (ableUp) directions.add(Direction.up);
      if (ableDown) directions.add(Direction.down);
      if (ableLeft) directions.add(Direction.left);
      if (ableRight) directions.add(Direction.right);
      process(directions[Random().nextInt(directions.length)]);
    }
  }

  void process([Direction? direction]) {
    if (direction != null) _game.move(direction);
    _game.add();
    if (!playable) _showGameOver = true;
    if (!_showedClear && max == 2048) {
      _showedClear = true;
      _showClear = true;
    }
    notifyListeners();
  }

  bool isNew(int row, int column) {
    final isNew = _game.isNew(row, column);
    if (isNew) {
      Future.delayed(Duration(milliseconds: 5), () {
        notifyListeners();
      });
    }
    return isNew;
  }

  bool able(Direction direction) {
    return _game.able(direction);
  }

  void add() {
    _game.add();
    notifyListeners();
  }

  void move(Direction direction) {
    _game.move(direction);
    notifyListeners();
  }

  void set(List<(int number, int row, int column)> targets, [bool edited = false]) {
    _game.set(targets);
    if (!_edited) _edited = edited;
    notifyListeners();
  }

  void initThemeMode(ThemeMode themeMode) {
    _themeMode ??= themeMode;
  }

  void changeThemeMode() {
    _themeMode = _themeMode == ThemeMode.dark ? ThemeMode.light : ThemeMode.dark;
    notifyListeners();
  }
}
