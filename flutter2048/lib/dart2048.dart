import "dart:io";
import "dart:math";


enum Direction { up, down, left, right }

class G2048 {
  late final List<List<int>> _game;
  int _max = 0;
  final ansiClear = "\u001B[0m";
  final ansiMap = {
    0: "\u001B[51m" "\u001B[40m" "\u001B[97m",
    2: "\u001B[51m" "\u001B[100m" "\u001B[97m",
    4: "\u001B[51m" "\u001B[47m" "\u001B[30m",
    8: "\u001B[51m" "\u001B[44m" "\u001B[30m",
    16: "\u001B[51m" "\u001B[46m" "\u001B[30m",
    32: "\u001B[51m" "\u001B[42m" "\u001B[30m",
    64: "\u001B[51m" "\u001B[43m" "\u001B[30m",
    -1: "\u001B[51m" "\u001B[41m" "\u001B[30m",
  };

  final int size;
  int get max => _max;
  int get score => _game.map((inner) => inner.reduce((a, b) => a + b)).reduce((a, b) => a + b);
  bool get free => _game.map((inner) => inner.any((it) => it == 0)).any((it) => it);
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

  G2048(this.size) {
    _game = List.generate(size, (_) => List.generate(size, (_) => 0));
    _add([2], 2);
  }

  void process(Direction direction) {
    _move(direction);
    _add();
  }

  void _add([List<int> item = const [2, 4], int time = 1]) {
    if (!free) return;
    final freePositions = <(int, int)>[];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (_game[i][j] == 0) freePositions.add((i, j));
      }
    }
    final swapPosition = freePositions[Random().nextInt(freePositions.length)];
    final swapItem = item[Random().nextInt(item.length)];
    _game[swapPosition.$1][swapPosition.$2] = swapItem;
    if (swapItem > _max) _max = swapItem;
    if (time > 1) _add(item, time - 1);
  }

  void _move(Direction direction) {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        final row = direction == Direction.down ? size - i - 1 : i;
        final column = direction == Direction.right ? size - j - 1 : j;

        final targetItem = _game[row][column];
        if (targetItem == 0) continue;

        final changedAreas = <int>[];
        switch (direction) {
          case Direction.up:
            for (int k = row - 1; k > -1; k--) {
              final compareItem = _game[k][column];
              if (!changedAreas.contains(k) && compareItem == targetItem) {
                if (compareItem * 2 > _max) _max = compareItem * 2;
                _game[k][column] *= 2;
                _game[row][column] = 0;
                changedAreas.add(k);
                break;
              }
              if (compareItem != 0) {
                _game[row][column] = 0;
                _game[k + 1][column] = targetItem;
                break;
              }
              if (k == 0) {
                _game[row][column] = 0;
                _game[k][column] = targetItem;
              }
            }
          case Direction.down:
            for (int k = row + 1; k < size; k++) {
              final compareItem = _game[k][column];
              if (!changedAreas.contains(k) && compareItem == targetItem) {
                if (compareItem * 2 > _max) _max = compareItem * 2;
                _game[k][column] *= 2;
                _game[row][column] = 0;
                changedAreas.add(k);
                break;
              }
              if (compareItem != 0) {
                _game[row][column] = 0;
                _game[k - 1][column] = targetItem;
                break;
              }
              if (k == size - 1) {
                _game[row][column] = 0;
                _game[k][column] = targetItem;
              }
            }
          case Direction.left:
            for (int k = column - 1; k > -1; k--) {
              final compareItem = _game[row][k];
              if (!changedAreas.contains(k) && compareItem == targetItem) {
                if (compareItem * 2 > _max) _max = compareItem * 2;
                _game[row][k] *= 2;
                _game[row][column] = 0;
                changedAreas.add(k);
                break;
              }
              if (compareItem != 0) {
                _game[row][column] = 0;
                _game[row][k + 1] = targetItem;
                break;
              }
              if (k == 0) {
                _game[row][column] = 0;
                _game[row][k] = targetItem;
              }
            }
          case Direction.right:
            for (int k = column + 1; k < size; k++) {
              final compareItem = _game[row][k];
              if (!changedAreas.contains(k) && compareItem == targetItem) {
                if (compareItem * 2 > _max) _max = compareItem * 2;
                _game[row][k] *= 2;
                _game[row][column] = 0;
                changedAreas.add(k);
                break;
              }
              if (compareItem != 0) {
                _game[row][column] = 0;
                _game[row][k - 1] = targetItem;
                break;
              }
              if (k == size - 1) {
                _game[row][column] = 0;
                _game[row][k] = targetItem;
              }
            }
        }
      }
    }
  }

  @override
  String toString({bool ansi = false, bool sortLeft = true, String sep = " "}) {
    int maxLength = _max.toString().length;
    var result = "";
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (ansi) result += "${ansiMap[_game[i][j]] ?? ansiMap[-1]!} ";
        if(sortLeft) {
          result += "${_game[i][j]}${" " * (maxLength - _game[i][j]
              .toString()
              .length)}";
        } else {
          result += "${" " * (maxLength - _game[i][j]
              .toString()
              .length)}${_game[i][j]}";
        }
        if (ansi) result += " $ansiClear";
        if (j != size - 1) result += sep;
      }
      if (i != size - 1) result += "\n";
    }
    return result;
  }
}


void write([String msg = "", String end = "\n"]) => stdout.write(msg + end);

void main() {
  write("Size: ", "");
  final size = int.parse(stdin.readLineSync()!);
  final g2048 = G2048(size);

  write(g2048.toString(ansi: true));
  write("[INIT]");
  write();

  while (g2048.able) {
    write("Move: ", "");
    final input = stdin.readLineSync()!.trim().toLowerCase();

    switch (input) {
      case "w":
        if (!g2048.ableCol) {
          write("Unable To MoveUp");
          write();
          continue;
        }
        g2048.process(Direction.up);
      case "a":
        if (!g2048.ableRow) {
          write("Unable To MoveLeft");
          write();
          continue;
        }
        g2048.process(Direction.left);
      case "s":
        if (!g2048.ableCol) {
          write("Unable To MoveDown");
          write();
          continue;
        }
        g2048.process(Direction.down);
      case "d":
        if (!g2048.ableRow) {
          write("Unable To MoveRight");
          write();
          continue;
        }
        g2048.process(Direction.right);
    }

    write(g2048.toString(ansi: true));
    write("max: ${g2048.max}, score: ${g2048.score}");
    write();
  }
}
