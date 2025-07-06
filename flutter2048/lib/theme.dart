import "package:flutter/material.dart";


ThemeData theme(ColorScheme colorScheme, TextTheme textTheme) => ThemeData(
  useMaterial3: true,
  brightness: colorScheme.brightness,
  colorScheme: colorScheme,
  textTheme: textTheme.apply(
    bodyColor: colorScheme.onSurface,
    displayColor: colorScheme.onSurface,
  ),
  scaffoldBackgroundColor: colorScheme.background,
  canvasColor: colorScheme.surface,
);


ThemeData light({TextTheme textTheme = const TextTheme()}) {
  return theme(lightScheme(), textTheme);
}

ThemeData dark({TextTheme textTheme = const TextTheme()}) {
  return theme(darkScheme(), textTheme);
}


ColorScheme lightScheme() {
  return const ColorScheme(
    brightness: Brightness.light,
    primary: Color(0xff835414),
    surfaceTint: Color(0xff835414),
    onPrimary: Color(0xffffffff),
    primaryContainer: Color(0xffffddb9),
    onPrimaryContainer: Color(0xff663e00),
    secondary: Color(0xff8f4b39),
    onSecondary: Color(0xffffffff),
    secondaryContainer: Color(0xffffdbd2),
    onSecondaryContainer: Color(0xff723524),
    tertiary: Color(0xff7c580d),
    onTertiary: Color(0xffffffff),
    tertiaryContainer: Color(0xffffdeab),
    onTertiaryContainer: Color(0xff5f4100),
    error: Color(0xff904a43),
    onError: Color(0xffffffff),
    errorContainer: Color(0xffffdad6),
    onErrorContainer: Color(0xff73332d),
    surface: Color(0xfffff8f5),
    onSurface: Color(0xff221a15),
    onSurfaceVariant: Color(0xff52443c),
    outline: Color(0xff84746b),
    outlineVariant: Color(0xffd7c2b8),
    shadow: Color(0xff000000),
    scrim: Color(0xff000000),
    inverseSurface: Color(0xff382e29),
    inversePrimary: Color(0xfff9bb72),
    primaryFixed: Color(0xffffddb9),
    onPrimaryFixed: Color(0xff2b1700),
    primaryFixedDim: Color(0xfff9bb72),
    onPrimaryFixedVariant: Color(0xff663e00),
    secondaryFixed: Color(0xffffdbd2),
    onSecondaryFixed: Color(0xff3a0a01),
    secondaryFixedDim: Color(0xffffb4a1),
    onSecondaryFixedVariant: Color(0xff723524),
    tertiaryFixed: Color(0xffffdeab),
    onTertiaryFixed: Color(0xff271900),
    tertiaryFixedDim: Color(0xffefbf6d),
    onTertiaryFixedVariant: Color(0xff5f4100),
    surfaceDim: Color(0xffe7d7cf),
    surfaceBright: Color(0xfffff8f5),
    surfaceContainerLowest: Color(0xffffffff),
    surfaceContainerLow: Color(0xfffff1ea),
    surfaceContainer: Color(0xfffceae2),
    surfaceContainerHigh: Color(0xfff6e5dd),
    surfaceContainerHighest: Color(0xfff0dfd7),
  );
}

ColorScheme darkScheme() {
  return const ColorScheme(
    brightness: Brightness.dark,
    primary: Color(0xfff9bb72),
    surfaceTint: Color(0xfff9bb72),
    onPrimary: Color(0xff472a00),
    primaryContainer: Color(0xff663e00),
    onPrimaryContainer: Color(0xffffddb9),
    secondary: Color(0xffffb4a1),
    onSecondary: Color(0xff561f10),
    secondaryContainer: Color(0xff723524),
    onSecondaryContainer: Color(0xffffdbd2),
    tertiary: Color(0xffefbf6d),
    onTertiary: Color(0xff422c00),
    tertiaryContainer: Color(0xff5f4100),
    onTertiaryContainer: Color(0xffffdeab),
    error: Color(0xffffb4ab),
    onError: Color(0xff561e19),
    errorContainer: Color(0xff73332d),
    onErrorContainer: Color(0xffffdad6),
    surface: Color(0xff1a120d),
    onSurface: Color(0xfff0dfd7),
    onSurfaceVariant: Color(0xffd7c2b8),
    outline: Color(0xff9f8d83),
    outlineVariant: Color(0xff52443c),
    shadow: Color(0xff000000),
    scrim: Color(0xff000000),
    inverseSurface: Color(0xfff0dfd7),
    inversePrimary: Color(0xff835414),
    primaryFixed: Color(0xffffddb9),
    onPrimaryFixed: Color(0xff2b1700),
    primaryFixedDim: Color(0xfff9bb72),
    onPrimaryFixedVariant: Color(0xff663e00),
    secondaryFixed: Color(0xffffdbd2),
    onSecondaryFixed: Color(0xff3a0a01),
    secondaryFixedDim: Color(0xffffb4a1),
    onSecondaryFixedVariant: Color(0xff723524),
    tertiaryFixed: Color(0xffffdeab),
    onTertiaryFixed: Color(0xff271900),
    tertiaryFixedDim: Color(0xffefbf6d),
    onTertiaryFixedVariant: Color(0xff5f4100),
    surfaceDim: Color(0xff1a120d),
    surfaceBright: Color(0xff413732),
    surfaceContainerLowest: Color(0xff140d08),
    surfaceContainerLow: Color(0xff221a15),
    surfaceContainer: Color(0xff261e19),
    surfaceContainerHigh: Color(0xff312823),
    surfaceContainerHighest: Color(0xff3d332d),
  );
}


enum ExtendedColor {
  color2(
    value: Color(0xffffdfce),
    light: ColorFamily(
      color: Color(0xff8c4f26),
      onColor: Color(0xffffffff),
      colorContainer: Color(0xffffdbc8),
      onColorContainer: Color(0xff6f3811),
    ),
    dark: ColorFamily(
      color: Color(0xffffb68b),
      onColor: Color(0xff522300),
      colorContainer: Color(0xff6f3811),
      onColorContainer: Color(0xffffdbc8),
    ),
  ),
  color4(
    value: Color(0xffd59874),
    light: ColorFamily(
      color: Color(0xff8c4f27),
      onColor: Color(0xffffffff),
      colorContainer: Color(0xffffdbc8),
      onColorContainer: Color(0xff6f3811),
    ),
    dark: ColorFamily(
      color: Color(0xffffb68b),
      onColor: Color(0xff522300),
      colorContainer: Color(0xff6f3811),
      onColorContainer: Color(0xffffdbc8),
    ),
  ),
  color8(
    value: Color(0xffde6d4f),
    light: ColorFamily(
      color: Color(0xff8f4b39),
      onColor: Color(0xffffffff),
      colorContainer: Color(0xffffdbd2),
      onColorContainer: Color(0xff723524),
    ),
    dark: ColorFamily(
      color: Color(0xffffb4a1),
      onColor: Color(0xff561f10),
      colorContainer: Color(0xff723524),
      onColorContainer: Color(0xffffdbd2),
    ),
  ),
  color16(
    value: Color(0xffff6841),
    light: ColorFamily(
      color: Color(0xff8f4b3a),
      onColor: Color(0xffffffff),
      colorContainer: Color(0xffffdbd2),
      onColorContainer: Color(0xff723524),
    ),
    dark: ColorFamily(
      color: Color(0xffffb4a2),
      onColor: Color(0xff561f11),
      colorContainer: Color(0xff723524),
      onColorContainer: Color(0xffffdbd2),
    ),
  ),
  color32(
    value: Color(0xfff65429),
    light: ColorFamily(
      color: Color(0xff8f4b39),
      onColor: Color(0xffffffff),
      colorContainer: Color(0xffffdbd2),
      onColorContainer: Color(0xff723524),
    ),
    dark: ColorFamily(
      color: Color(0xffffb4a1),
      onColor: Color(0xff561f11),
      colorContainer: Color(0xff723524),
      onColorContainer: Color(0xffffdbd2),
    ),
  ),
  color64(
    value: Color(0xffc02e00),
    light: ColorFamily(
      color: Color(0xff8f4b39),
      onColor: Color(0xffffffff),
      colorContainer: Color(0xffffdbd2),
      onColorContainer: Color(0xff723524),
    ),
    dark: ColorFamily(
      color: Color(0xffffb4a1),
      onColor: Color(0xff561f10),
      colorContainer: Color(0xff723524),
      onColorContainer: Color(0xffffdbd2),
    ),
  ),
  color128(
    value: Color(0xff9e2400),
    light: ColorFamily(
      color: Color(0xff8f4b3a),
      onColor: Color(0xffffffff),
      colorContainer: Color(0xffffdbd2),
      onColorContainer: Color(0xff723524),
    ),
    dark: ColorFamily(
      color: Color(0xffffb4a2),
      onColor: Color(0xff561f11),
      colorContainer: Color(0xff723524),
      onColorContainer: Color(0xffffdbd2),
    ),
  ),
  color256(
    value: Color(0xffebcea1),
    light: ColorFamily(
      color: Color(0xff7b580d),
      onColor: Color(0xffffffff),
      colorContainer: Color(0xffffdeaa),
      onColorContainer: Color(0xff5f4100),
    ),
    dark: ColorFamily(
      color: Color(0xffefbf6d),
      onColor: Color(0xff422c00),
      colorContainer: Color(0xff5f4100),
      onColorContainer: Color(0xffffdeaa),
    ),
  ),
  color512(
    value: Color(0xffddbf92),
    light: ColorFamily(
      color: Color(0xff7c580d),
      onColor: Color(0xffffffff),
      colorContainer: Color(0xffffdeac),
      onColorContainer: Color(0xff604100),
    ),
    dark: ColorFamily(
      color: Color(0xfff0bf6d),
      onColor: Color(0xff432c00),
      colorContainer: Color(0xff604100),
      onColorContainer: Color(0xffffdeac),
    ),
  ),
  color1024(
    value: Color(0xfff0bb60),
    light: ColorFamily(
      color: Color(0xff7c580d),
      onColor: Color(0xffffffff),
      colorContainer: Color(0xffffdeac),
      onColorContainer: Color(0xff5f4100),
    ),
    dark: ColorFamily(
      color: Color(0xfff0bf6d),
      onColor: Color(0xff422c00),
      colorContainer: Color(0xff5f4100),
      onColorContainer: Color(0xffffdeac),
    ),
  ),
  color2048(
    value: Color(0xffe8a400),
    light: ColorFamily(
      color: Color(0xff7c580d),
      onColor: Color(0xffffffff),
      colorContainer: Color(0xffffdeab),
      onColorContainer: Color(0xff5f4100),
    ),
    dark: ColorFamily(
      color: Color(0xffefbf6d),
      onColor: Color(0xff422c00),
      colorContainer: Color(0xff5f4100),
      onColorContainer: Color(0xffffdeab),
    ),
  ),
  colorBig(
    value: Color(0xff654500),
    light: ColorFamily(
      color: Color(0xff7c580d),
      onColor: Color(0xffffffff),
      colorContainer: Color(0xffffdeac),
      onColorContainer: Color(0xff5f4100),
    ),
    dark: ColorFamily(
      color: Color(0xfff0bf6d),
      onColor: Color(0xff432c00),
      colorContainer: Color(0xff5f4100),
      onColorContainer: Color(0xffffdeac),
    ),
  );

  const ExtendedColor({
    required this.value,
    required this.light,
    required this.dark,
  });

  final Color value;
  final ColorFamily light;
  final ColorFamily dark;
}


class ColorFamily {
  const ColorFamily({
    required this.color,
    required this.onColor,
    required this.colorContainer,
    required this.onColorContainer,
  });

  final Color color;
  final Color onColor;
  final Color colorContainer;
  final Color onColorContainer;
}
