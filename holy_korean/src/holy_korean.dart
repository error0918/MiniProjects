final start = "가".codeUnitAt(0), end = "힣".codeUnitAt(0);

const firstList = ["ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄸ", "ㄹ", "ㅁ", "ㅂ", "ㅃ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ"]; // 초성
const middleList = ["ㅏ", "ㅐ", "ㅑ", "ㅒ", "ㅓ", "ㅔ", "ㅕ", "ㅖ", "ㅗ", "ㅘ", "ㅙ", "ㅚ", "ㅛ", "ㅜ", "ㅝ", "ㅞ", "ㅟ", "ㅠ", "ㅡ", "ㅢ", "ㅣ"]; // 중성
const lastList = ["", "ㄱ", "ㄲ", "ㄳ", "ㄴ", "ㄵ", "ㄶ", "ㄷ", "ㄹ", "ㄺ", "ㄻ", "ㄼ", "ㄽ", "ㄾ", "ㄿ", "ㅀ", "ㅁ", "ㅂ", "ㅄ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ"]; // 종성


enum KoreanType { Full, Consonant, Vowel, None } // 완전한 글자, 자음, 모음, 한글이 아닌 글자


KoreanType detectKoreanType(String char) => detectKoreanTypeCode(char.codeUnitAt(0));

KoreanType detectKoreanTypeCode(int code) {
  if ("가".codeUnitAt(0) <= code && code <= "힣".codeUnitAt(0)) return KoreanType.Full;
  else if ("ㄱ".codeUnitAt(0) <= code && code <= "ㅎ".codeUnitAt(0)) return KoreanType.Consonant;
  else if ("ㅏ".codeUnitAt(0) <= code && code <= "ㅣ".codeUnitAt(0)) return KoreanType.Vowel;
  else return KoreanType.None;
}


String combineKorean({
  required String first,
  required String middle,
  String? last
}) => combineKoreanCode(
    first: firstList.indexOf(first),
    middle: middleList.indexOf(middle),
    last: lastList.indexOf(last ?? "")
  );

String combineKoreanCode({
  required int first,
  required int middle,
  int last = 0
}) => String.fromCharCode((first * 21 + middle) * 28 + last + start);


(String first, String middle, String? last) disassembleKorean(String char) =>
    disassembleKoreanCode(char.codeUnitAt(0));

(String first, String middle, String? last) disassembleKoreanCode(int code) =>
    (firstList[(code - start) ~/ 28 ~/ 21],
    middleList[(code - start) ~/ 28 % 21],
    lastList[(code - start) % 28] == "" ? null : lastList[(code - start) % 28]);


String ohMyGodKorean(String original) {
  var result = "";
  original.runes.forEach((code) {
    final koreanType = detectKoreanTypeCode(code);
    switch (koreanType) {
      case KoreanType.Full:
        result += ohMyGodFull(code);
      case KoreanType.Consonant:
        result += ohMyGodConsonant(code);
      case KoreanType.Vowel:
        result += ohMyGodVowel(code);
      case KoreanType.None:
        result += String.fromCharCode(code);
    }
  });
  return result;
}

String ohMyGodFull(int code) {
  final char = String.fromCharCode(code);
  return switch (char) {
    // TODO
    _ => char
  };
}

String ohMyGodConsonant(int code) {
  final char = String.fromCharCode(code);
  return switch (char) {
    // TODO
    "ㄱ" => "ㄱ",
    "ㄲ" => "ㄲ",
    "ㄳ" => "ㄳ",
    "ㄴ" => "ㄴ",
    "ㄵ" => "ㄵ",
    "ㄶ" => "ㄶ",
    "ㄷ" => "ㄷ",
    "ㄸ" => "ㄸ",
    "ㄹ" => "ㄹ",
    "ㄺ" => "ㄺ",
    "ㄻ" => "ㄻ",
    "ㄼ" => "ㄼ",
    "ㄽ" => "ㄽ",
    "ㄾ" => "ㄾ",
    "ㄿ" => "ㄿ",
    "ㅀ" => "ㅀ",
    "ㅁ" => "ㅁ",
    "ㅂ" => "ㅂ",
    "ㅃ" => "ㅃ",
    "ㅄ" => "ㅄ",
    "ㅅ" => "ㅅ",
    "ㅆ" => "ㅆ",
    "ㅇ" => "ㅇ",
    "ㅈ" => "ㅈ",
    "ㅉ" => "ㅉ",
    "ㅊ" => "ㅊ",
    "ㅋ" => "ㅋ",
    "ㅌ" => "ㅌ",
    "ㅍ" => "ㅍ",
    "ㅎ" => "ㅎ",
    _ => char
  };
}

String ohMyGodVowel(int code) {
  final char = String.fromCharCode(code);
  return switch (char) {
    "ㅏ" => "ㅏ",
    "ㅐ" => "ㅐ",
    "ㅑ" => "ㅑ",
    "ㅒ" => "ㅒ",
    "ㅓ" => "ㅓ",
    "ㅔ" => "ㅔ",
    "ㅕ" => "ㅕ",
    "ㅖ" => "ㅖ",
    "ㅗ" => "ㅗ",
    "ㅘ" => "ㅘ",
    "ㅙ" => "ㅙ",
    "ㅚ" => "ㅚ",
    "ㅛ" => "ㅛ",
    "ㅜ" => "ㅜ",
    "ㅝ" => "ㅝ",
    "ㅞ" => "ㅞ",
    "ㅟ" => "ㅟ",
    "ㅠ" => "ㅠ",
    "ㅡ" => "ㅡ",
    "ㅢ" => "ㅢ",
    "ㅣ" => "ㅣ",
    _ => char
  };
}