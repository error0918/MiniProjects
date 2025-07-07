import 'dart:math';


enum Direction { up, down, left, right }

class Game {
  final int size;
  late final List<List<Tile>> _game;
  int _max = 0;
  int _ticket = 0;

  Game({required this.size}) {
    _game = List.generate(size, (_) => List.generate(size, (_) => Tile(0)));
    add(time: 2);
  }

  List<List<int>> get board => List.generate(size, (i) => List.generate(size, (j) => _game[j][i].number));
  int get max => _max;
  int get score => _game.expand((inner) => inner).fold(0, (sum, tile) => sum + tile.number);
  bool get free => _game.map((inner) => inner.any((it) => it.number == 0)).any((it) => it);
  bool get ableCol {
    if (free) return true;
    for (int i = 0; i < size; i++) {
      var lastItem = _game[0][i];
      for (int j = 1; j < size; j++) {
        if (_game[j][i] == lastItem) return true;
        lastItem = _game[j][i];
      }
    }
    return false;
  }
  bool get ableRow {
    if (free) return true;
    for (int i = 0; i < size; i++) {
      var lastItem = _game[i][0];
      for (int j = 1; j < size; j++) {
        if (_game[i][j] == lastItem) return true;
        lastItem = _game[i][j];
      }
    }
    return false;
  }
  bool get able => ableCol || ableRow;

  void add({ List<int> item = const [2, 4], int time = 1 }) {
    if (!free) return;
    _ticket++;

    final freePositions = <(int, int)>[];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (_game[i][j].number == 0) freePositions.add((i, j));
      }
    }

    final swapPosition = freePositions[Random().nextInt(freePositions.length)];
    final swapItem = item[Random().nextInt(item.length)];
    _game[swapPosition.$1][swapPosition.$2].number = swapItem;
    _game[swapPosition.$1][swapPosition.$2].ticket = _ticket;

    if (swapItem > _max) _max = swapItem;
    if (time > 1) add(item: item, time: time - 1);
  }

  void move(Direction direction) {
    _ticket++;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        final row = direction == Direction.down ? size - i - 1 : i;
        final column = direction == Direction.right ? size - j - 1 : j;

        final targetItem = _game[row][column];
        if (targetItem.number == 0) continue;

        switch (direction) {
          case Direction.up:
            for (int k = row - 1; k > -1; k--) {
              final compareItem = _game[k][column];
              if (compareItem.ticket != _ticket && compareItem == targetItem) {
                if (compareItem.number * 2 > _max) _max = compareItem.number * 2;
                _game[k][column].number *= 2;
                _game[k][column].ticket = _ticket;
                _game[row][column] = Tile(0);
                break;
              }
              if (compareItem.number != 0) {
                _game[row][column] = Tile(0);
                _game[k + 1][column] = targetItem;
                break;
              }
              if (k == 0) {
                _game[row][column] = Tile(0);
                _game[k][column] = targetItem;
              }
            }
          case Direction.down:
            for (int k = row + 1; k < size; k++) {
              final compareItem = _game[k][column];
              if (compareItem.ticket != _ticket && compareItem == targetItem) {
                if (compareItem.number * 2 > _max) _max = compareItem.number * 2;
                _game[k][column].number *= 2;
                _game[k][column].ticket = _ticket;
                _game[row][column] = Tile(0);
                break;
              }
              if (compareItem.number != 0) {
                _game[row][column] = Tile(0);
                _game[k - 1][column] = targetItem;
                break;
              }
              if (k == size - 1) {
                _game[row][column] = Tile(0);
                _game[k][column] = targetItem;
              }
            }
          case Direction.left:
            for (int k = column - 1; k > -1; k--) {
              final compareItem = _game[row][k];
              if (compareItem.ticket != _ticket && compareItem == targetItem) {
                if (compareItem.number * 2 > _max) _max = compareItem.number * 2;
                _game[row][k].number *= 2;
                _game[row][k].ticket = _ticket;
                _game[row][column] = Tile(0);
                break;
              }
              if (compareItem.number != 0) {
                _game[row][column] = Tile(0);
                _game[row][k + 1] = targetItem;
                break;
              }
              if (k == 0) {
                _game[row][column] = Tile(0);
                _game[row][k] = targetItem;
              }
            }
          case Direction.right:
            for (int k = column + 1; k < size; k++) {
              final compareItem = _game[row][k];
              if (compareItem.ticket != _ticket && compareItem == targetItem) {
                if (compareItem.number * 2 > _max) _max = compareItem.number * 2;
                _game[row][k].number *= 2;
                _game[row][k].ticket = _ticket;
                _game[row][column] = Tile(0);
                break;
              }
              if (compareItem.number != 0) {
                _game[row][column] = Tile(0);
                _game[row][k - 1] = targetItem;
                break;
              }
              if (k == size - 1) {
                _game[row][column] = Tile(0);
                _game[row][k] = targetItem;
              }
            }
        }
      }
    }
  }
}


class Tile {
  int number;
  int ticket = 0;

  Tile(this.number);

  @override
  bool operator ==(Object other) {
    if (runtimeType != other.runtimeType) return false;
    return number == (other as Tile).number;
  }

  @override
  int get hashCode => number ^ ticket;
}
