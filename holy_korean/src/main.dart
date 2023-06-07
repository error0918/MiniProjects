import 'dart:convert';
import 'dart:io';

import 'holy_korean.dart' as holy_korean;

void main() {
  stdout.write("텍스트를 입력하세요.\n >> ");
  final input = stdin.readLineSync(encoding: utf8) ?? "";
  print(holy_korean.ohMyGodKorean(input));
}