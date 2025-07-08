import 'dart:math';


enum Direction { up, down, left, right }

class Game {
  final int size;
  late final List<List<Tile>> _board;
  int _max = 0;
  int _ticket = 0;

  Game({required this.size}) {
    _board = List.generate(size, (_) => List.generate(size, (_) => Tile(0)));
    add(time: 2);
  }

  List<List<Tile>> get board => List.generate(size, (i) => List.generate(size, (j) => _board[i][j].clone()));
  int get max => _max;
  int get score => _board.expand((inner) => inner).fold(0, (sum, tile) => sum + tile.number);
  bool get free => _board.map((inner) => inner.any((it) => it.number == 0)).any((it) => it);
  bool get ableCol {
    if (free) return true;
    for (int i = 0; i < size; i++) {
      var lastItem = _board[0][i];
      for (int j = 1; j < size; j++) {
        if (_board[j][i] == lastItem) return true;
        lastItem = _board[j][i];
      }
    }
    return false;
  }
  bool get ableRow {
    if (free) return true;
    for (int i = 0; i < size; i++) {
      var lastItem = _board[i][0];
      for (int j = 1; j < size; j++) {
        if (_board[i][j] == lastItem) return true;
        lastItem = _board[i][j];
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
        if (_board[i][j].number == 0) freePositions.add((i, j));
      }
    }

    final swapPosition = freePositions[Random().nextInt(freePositions.length)];
    final swapItem = item[Random().nextInt(item.length)];
    _board[swapPosition.$1][swapPosition.$2].number = swapItem;
    _board[swapPosition.$1][swapPosition.$2].changeTicket = _ticket;

    if (swapItem > _max) _max = swapItem;
    if (time > 1) add(item: item, time: time - 1);
  }

  void move(Direction direction) {
    _ticket++;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        final row = direction == Direction.down ? size - i - 1 : i;
        final column = direction == Direction.right ? size - j - 1 : j;

        final targetItem = _board[row][column];
        if (targetItem.number == 0) continue;

        switch (direction) {
          case Direction.up:
            for (int k = row - 1; k > -1; k--) {
              final compareItem = _board[k][column];
              if (compareItem.changeTicket != _ticket && compareItem == targetItem) {
                if (compareItem.number * 2 > _max) _max = compareItem.number * 2;
                _board[k][column].number *= 2;
                _board[k][column].changeTicket = _ticket;
                _board[row][column] = Tile(0);
                break;
              }
              if (compareItem.number != 0) {
                _board[row][column] = Tile(0);
                _board[k + 1][column] = targetItem;
                break;
              }
              if (k == 0) {
                _board[row][column] = Tile(0);
                _board[k][column] = targetItem;
              }
            }
          case Direction.down:
            for (int k = row + 1; k < size; k++) {
              final compareItem = _board[k][column];
              if (compareItem.changeTicket != _ticket && compareItem == targetItem) {
                if (compareItem.number * 2 > _max) _max = compareItem.number * 2;
                _board[k][column].number *= 2;
                _board[k][column].changeTicket = _ticket;
                _board[row][column] = Tile(0);
                break;
              }
              if (compareItem.number != 0) {
                _board[row][column] = Tile(0);
                _board[k - 1][column] = targetItem;
                break;
              }
              if (k == size - 1) {
                _board[row][column] = Tile(0);
                _board[k][column] = targetItem;
              }
            }
          case Direction.left:
            for (int k = column - 1; k > -1; k--) {
              final compareItem = _board[row][k];
              if (compareItem.changeTicket != _ticket && compareItem == targetItem) {
                if (compareItem.number * 2 > _max) _max = compareItem.number * 2;
                _board[row][k].number *= 2;
                _board[row][k].changeTicket = _ticket;
                _board[row][column] = Tile(0);
                break;
              }
              if (compareItem.number != 0) {
                _board[row][column] = Tile(0);
                _board[row][k + 1] = targetItem;
                break;
              }
              if (k == 0) {
                _board[row][column] = Tile(0);
                _board[row][k] = targetItem;
              }
            }
          case Direction.right:
            for (int k = column + 1; k < size; k++) {
              final compareItem = _board[row][k];
              if (compareItem.changeTicket != _ticket && compareItem == targetItem) {
                if (compareItem.number * 2 > _max) _max = compareItem.number * 2;
                _board[row][k].number *= 2;
                _board[row][k].changeTicket = _ticket;
                _board[row][column] = Tile(0);
                break;
              }
              if (compareItem.number != 0) {
                _board[row][column] = Tile(0);
                _board[row][k - 1] = targetItem;
                break;
              }
              if (k == size - 1) {
                _board[row][column] = Tile(0);
                _board[row][k] = targetItem;
              }
            }
        }
      }
    }
  }
}


class Tile {
  static int _idTicket = 0;
  int _id = _idTicket++;
  int number;
  int changeTicket = 0;
  int get id => _id;

  Tile(this.number);
  Tile._(this.number, this.changeTicket, this._id);

  Tile clone() => Tile._(number, changeTicket, _id);

  @override
  bool operator ==(Object other) => runtimeType == other.runtimeType && number == (other as Tile).number;

  @override
  int get hashCode => _id ^ number ^ changeTicket;
}
