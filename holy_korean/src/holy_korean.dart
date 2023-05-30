import 'korean_util.dart';
import 'list_extension.dart';


String ohMyGodKorean(String original) {
  var result = "";
  original.runes.forEach((code) {
    final koreanType = detectKoreanTypeCode(code);
    switch (koreanType) {
      case KoreanType.Full:
        result += ohMyGodFullCode(code);
      case KoreanType.Consonant:
        result += ohMyGodConsonantCode(code);
      case KoreanType.Vowel:
        result += ohMyGodVowelCode(code);
      case KoreanType.None:
        result += String.fromCharCode(code);
    }
  });
  return result;
}


String ohMyGodFull(String char) => ohMyGodConsonantCode(char.codeUnitAt(0));

String ohMyGodFullCode(int code) {
  final char = String.fromCharCode(code);
  return switch (char) {
    // TODO
    "무" => ["무", "無"].random()!,
    "미" => ["미", "美"].random()!,
    "와" => ["와", "Wa"].random()!,
    _ => char
  };
}


String ohMyGodConsonant(String char) => ohMyGodConsonantCode(char.codeUnitAt(0));

String ohMyGodConsonantCode(int code) {
  final char = String.fromCharCode(code);
  return switch (char) {
    // TODO
    "ㄱ" => ["ㄱ", ">", "⁊", "⌝"].random()!,
    "ㄲ" => ["ㄲ" "⨠"].random()!, // TODO
    "ㄳ" => ["ㄳ"].random()!, // TODO
    "ㄴ" => ["ㄴ", "L", "<", "⌞", "Ⅼ"].random()!,
    "ㄵ" => ["ㄵ"].random()!, // TODO
    "ㄶ" => ["ㄶ"].random()!, // TODO
    "ㄷ" => ["ㄷ", "[", "ɽ", "⫍", "Ϲ", "ϲ", "⊏"].random()!,
    "ㄸ" => ["ㄸ"].random()!, // TODO
    "ㄹ" => ["ㄹ"].random()!, // TODO
    "ㄺ" => ["ㄺ"].random()!, // TODO
    "ㄻ" => ["ㄻ"].random()!, // TODO
    "ㄼ" => ["ㄼ"].random()!, // TODO
    "ㄽ" => ["ㄽ"].random()!, // TODO
    "ㄾ" => ["ㄾ"].random()!, // TODO
    "ㄿ" => ["ㄿ"].random()!, // TODO
    "ㅀ" => ["ㅀ"].random()!, // TODO
    "ㅁ" => ["ㅁ", "[]", "▢", "▥", "▨", "▬", "▭", "▣", "▦", "▩", "▮", "▯", "▤", "▧","□", "■", "◻", "■", "◩", "◪"].random()!,
    "ㅂ" => ["ㅂ"].random()!, // TODO
    "ㅃ" => ["ㅃ"].random()!, // TODO
    "ㅄ" => ["ㅄ"].random()!, // TODO
    "ㅅ" => ["ㅅ", "^", "⁁", "∧", "⋀", "⋏", "⋌", "⩘"].random()!, // TODO
    "ㅆ" => ["ㅆ"].random()!, // TODO
    "ㅇ" => ["ㅇ", "O", "o", "●", "○", "◍", "◓", "◉", "◎", "◒", "◐", "◑", "◕", "◔", "◯", "⨀", "⨁", "⨂"].random()!, // TODO
    "ㅈ" => ["ㅈ"].random()!, // TODO
    "ㅉ" => ["ㅉ"].random()!, // TODO
    "ㅊ" => ["ㅊ"].random()!, // TODO
    "ㅋ" => ["ㅋ"].random()!, // TODO
    "ㅌ" => ["ㅌ"].random()!, // TODO
    "ㅍ" => ["ㅍ"].random()!, // TODO
    "ㅎ" => ["ㅎ"].random()!, // TODO
    _ => char
  };
}


String ohMyGodVowel(String char) => ohMyGodVowelCode(char.codeUnitAt(0));

String ohMyGodVowelCode(int code) {
  final char = String.fromCharCode(code);
  return switch (char) {
    "ㅏ" => ["ㅏ"].random()!,
    "ㅐ" => ["ㅐ"].random()!,
    "ㅑ" => ["ㅑ"].random()!,
    "ㅒ" => ["ㅒ"].random()!,
    "ㅓ" => ["ㅓ"].random()!,
    "ㅔ" => ["ㅔ"].random()!,
    "ㅕ" => ["ㅕ"].random()!,
    "ㅖ" => ["ㅖ"].random()!,
    "ㅗ" => ["ㅗ"].random()!,
    "ㅘ" => ["ㅘ"].random()!,
    "ㅙ" => ["ㅙ"].random()!,
    "ㅚ" => ["ㅚ"].random()!,
    "ㅛ" => ["ㅛ"].random()!,
    "ㅜ" => ["ㅜ"].random()!,
    "ㅝ" => ["ㅝ"].random()!,
    "ㅞ" => ["ㅞ"].random()!,
    "ㅟ" => ["ㅟ"].random()!,
    "ㅠ" => ["ㅠ"].random()!,
    "ㅡ" => ["ㅡ"].random()!,
    "ㅢ" => ["ㅢ"].random()!,
    "ㅣ" => ["ㅣ"].random()!,
    _ => char
  };
}