import 'dart:math';

extension RandomListExtension<T> on List<T> {
  T? random() {
    return this.length == 0 ? null : this[Random().nextInt(this.length)];
  }
}