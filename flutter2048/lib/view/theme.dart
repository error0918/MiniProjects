import "package:flutter/material.dart";

/*
 * Primary: #927451
 * Secondary: #CD9000
 * Tertiary: #FF734E
 * Error: #FF5449
 * Neutral: #F9EFEA
 * Neutral Variant: #FFC295
 */


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

    primary: Color(0xff684c38),
    surfaceTint: Color(0xff755843),
    onPrimary: Color(0xffffffff),
    primaryContainer: Color(0xff82644e),
    onPrimaryContainer: Color(0xffffe7d7),

    secondary: Color(0xff7e5700),
    onSecondary: Color(0xffffffff),
    secondaryContainer: Color(0xffcd9000),
    onSecondaryContainer: Color(0xff462f00),

    tertiary: Color(0xffaa3616),
    onTertiary: Color(0xffffffff),
    tertiaryContainer: Color(0xffff734e),
    onTertiaryContainer: Color(0xff691500),

    error: Color(0xffb41c1b),
    onError: Color(0xffffffff),
    errorContainer: Color(0xffd83831),
    onErrorContainer: Color(0xfffffbff),

    surface: Color(0xfffff8f5),
    onSurface: Color(0xff221a14),
    onSurfaceVariant: Color(0xff51443b),

    outline: Color(0xff7f7669),
    outlineVariant: Color(0xffd1c5b6),

    shadow: Color(0xff000000),
    scrim: Color(0xff000000),

    inverseSurface: Color(0xff362f27),
    inversePrimary: Color(0xffe5bfa5),
    primaryFixed: Color(0xffffdcc4),
    onPrimaryFixed: Color(0xff2b1706),
    primaryFixedDim: Color(0xffe5bfa5),
    onPrimaryFixedVariant: Color(0xff5b412d),

    secondaryFixed: Color(0xffffdeac),
    onSecondaryFixed: Color(0xff281900),
    secondaryFixedDim: Color(0xfffeba39),
    onSecondaryFixedVariant: Color(0xff5f4100),

    tertiaryFixed: Color(0xffffdbd2),
    onTertiaryFixed: Color(0xff3c0800),
    tertiaryFixedDim: Color(0xffffb4a1),
    onTertiaryFixedVariant: Color(0xff891f00),

    surfaceDim: Color(0xffe7d7ce),
    surfaceBright: Color(0xfffff8f5),
    surfaceContainerLowest: Color(0xffffffff),
    surfaceContainerLow: Color(0xfffff1e9),
    surfaceContainer: Color(0xfffbebe1),
    surfaceContainerHigh: Color(0xfff5e5db),
    surfaceContainerHighest: Color(0xffefdfd6),
  );
}

ColorScheme darkScheme() {
  return const ColorScheme(
    brightness: Brightness.dark,

    primary: Color(0xffe5bfa5),
    surfaceTint: Color(0xffe5bfa5),
    onPrimary: Color(0xff422b19),
    primaryContainer: Color(0xff82644e),
    onPrimaryContainer: Color(0xffffe7d7),

    secondary: Color(0xfffeba39),
    onSecondary: Color(0xff422c00),
    secondaryContainer: Color(0xffcd9000),
    onSecondaryContainer: Color(0xff462f00),

    tertiary: Color(0xffffb4a1),
    onTertiary: Color(0xff611300),
    tertiaryContainer: Color(0xffff734e),
    onTertiaryContainer: Color(0xff691500),

    error: Color(0xffffb4ab),
    onError: Color(0xff690005),
    errorContainer: Color(0xffff5449),
    onErrorContainer: Color(0xff5c0004),

    surface: Color(0xff19120d),
    onSurface: Color(0xffefdfd6),
    onSurfaceVariant: Color(0xffd6c3b7),

    outline: Color(0xff9a8f82),
    outlineVariant: Color(0xff4e463a),

    shadow: Color(0xff000000),
    scrim: Color(0xff000000),

    inverseSurface: Color(0xffe7e1df),
    inversePrimary: Color(0xff755843),
    primaryFixed: Color(0xffffdcc4),
    onPrimaryFixed: Color(0xff2b1706),
    primaryFixedDim: Color(0xffe5bfa5),
    onPrimaryFixedVariant: Color(0xff5b412d),

    secondaryFixed: Color(0xffffdeac),
    onSecondaryFixed: Color(0xff281900),
    secondaryFixedDim: Color(0xfffeba39),
    onSecondaryFixedVariant: Color(0xff5f4100),

    tertiaryFixed: Color(0xffffdbd2),
    onTertiaryFixed: Color(0xff3c0800),
    tertiaryFixedDim: Color(0xffffb4a1),
    onTertiaryFixedVariant: Color(0xff891f00),

    surfaceDim: Color(0xff19120d),
    surfaceBright: Color(0xff413731),
    surfaceContainerLowest: Color(0xff140d08),
    surfaceContainerLow: Color(0xff221a14),
    surfaceContainer: Color(0xff261e18),
    surfaceContainerHigh: Color(0xff312822),
    surfaceContainerHighest: Color(0xff3c332d),
  );
}


enum ExtendedColor {
  color2(
    value: Color(0xffffdfce),
    light: ColorFamily(
      color: Color(0xffffdfce),
      onColor: Color(0xff382f28),
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
      color: Color(0xffd59874),
      onColor: Color(0xff382f28),
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
      color: Color(0xffde6d4f),
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
      color: Color(0xffff6841),
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
      color: Color(0xfff65429),
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
      color: Color(0xffc02e00),
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
      color: Color(0xff9e2400),
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
      color: Color(0xffebcea1),
      onColor: Color(0xff382f28),
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
      color: Color(0xffddbf92),
      onColor: Color(0xff382f28),
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
      color: Color(0xfff0bb60),
      onColor: Color(0xff382f28),
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
      color: Color(0xffe8a400),
      onColor: Color(0xff382f28),
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
    value: Color(0xffEFBF6D),
    light: ColorFamily(
      color: Color(0xffEFBF6D),
      onColor: Color(0xff382f28),
      colorContainer: Color(0xffffdeab),
      onColorContainer: Color(0xff5f4100),
    ),
    dark: ColorFamily(
      color: Color(0xffefbf6d),
      onColor: Color(0xff422c00),
      colorContainer: Color(0xff5f4100),
      onColorContainer: Color(0xffffdeab),
    ),
  );

  const ExtendedColor({
    required this.value,
    required this.light,
    required this.dark,
  });

  static const _map = {
    2: color2,
    4: color4,
    8: color8,
    16: color16,
    32: color32,
    64: color64,
    128: color128,
    256: color256,
    512: color512,
    1024: color1024,
    2048: color2048,
  };

  final Color value;
  final ColorFamily light;
  final ColorFamily dark;

  static ExtendedColor get(int block) {
    return _map[block] ?? colorBig;
  }

  ColorFamily of(BuildContext context) =>
      Theme.of(context).brightness == Brightness.light ? light : dark;
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
