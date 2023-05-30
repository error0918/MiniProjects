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