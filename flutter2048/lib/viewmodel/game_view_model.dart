import 'dart:math';
import 'package:flutter/foundation.dart';

import '/model/game.dart';

class GameViewModel extends ChangeNotifier {
  Game _game = Game(size: 4);

  List<List<int>> get board => _game.board;
  int get size => _game.size;
  int get max => _game.max;
  int get score => _game.score;
  bool get free => _game.free;
  bool get ableCol => _game.ableCol;
  bool get ableRow => _game.ableRow;
  bool get able => _game.able;

  void playNewGame({ int size = 4 }) {
    _game = Game(size: size);
    notifyListeners();
  }

  void autoProcess() {
    final (ableCol_, ableRow_) = (ableCol, ableRow);
    if (ableCol_ && ableRow_) {
      process([Direction.up, Direction.down, Direction.left, Direction.right][Random().nextInt(4)]);
    } else if (ableCol_) {
      process([Direction.up, Direction.down][Random().nextInt(2)]);
    } else if (ableRow_) {
      process([Direction.left, Direction.right][Random().nextInt(2)]);
    }
  }

  void process(Direction direction) {
    _game.move(direction);
    _game.add();
    notifyListeners();
  }

  void add() {
    _game.add();
    notifyListeners();
  }

  void move(Direction direction) {
    _game.move(direction);
    notifyListeners();
  }
}
