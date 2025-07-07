import 'package:flutter/foundation.dart';

import '/model/game.dart';

class GameViewModel extends ChangeNotifier {
  final Game _game = Game();
  List<List<int>> get board => [[0, 2, 0, 4], [16, 0, 8, 0], [0, 128, 0, 0], [0, 0, 0, 32]];
}
