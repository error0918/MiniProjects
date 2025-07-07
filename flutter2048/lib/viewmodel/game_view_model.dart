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
