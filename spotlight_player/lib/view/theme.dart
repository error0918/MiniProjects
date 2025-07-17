import "package:flutter/material.dart";

/*
 * Primary: #5F6DB8
 * Secondary: #9E5E53
 * Tertiary: #AB8AA0
 * Error: #FF5449
 * Neutral: #FFFFFF
 * Neutral Variant: #E4E7FF
 */


ThemeData theme(ColorScheme colorScheme, TextTheme textTheme) => ThemeData(
  useMaterial3: true,
  brightness: colorScheme.brightness,
  colorScheme: colorScheme,
  textTheme: textTheme.apply(
    bodyColor: colorScheme.onSurface,
    displayColor: colorScheme.onSurface,
  ),
  sliderTheme: const SliderThemeData(
    year2023: false,
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

    primary: Color(0xff46549d),
    surfaceTint: Color(0xff4b59a2),
    onPrimary: Color(0xffffffff),
    primaryContainer: Color(0xff5f6db8),
    onPrimaryContainer: Color(0xfffaf7ff),

    secondary: Color(0xff81463c),
    onSecondary: Color(0xffffffff),
    secondaryContainer: Color(0xff9e5e53),
    onSecondaryContainer: Color(0xfffff0ee),

    tertiary: Color(0xff73566a),
    onTertiary: Color(0xffffffff),
    tertiaryContainer: Color(0xffab8aa0),
    onTertiaryContainer: Color(0xff3d2536),

    error: Color(0xffba1a1a),
    onError: Color(0xffffffff),
    errorContainer: Color(0xffffdad6),
    onErrorContainer: Color(0xff93000a),

    surface: Color(0xfffcf8f8),
    onSurface: Color(0xff1c1b1b),
    onSurfaceVariant: Color(0xff46464c),

    outline: Color(0xff77767d),
    outlineVariant: Color(0xffc7c6cd),

    shadow: Color(0xff000000),
    scrim: Color(0xff000000),

    inverseSurface: Color(0xff313030),
    inversePrimary: Color(0xffbac3ff),
    primaryFixed: Color(0xffdee1ff),
    onPrimaryFixed: Color(0xff001159),
    primaryFixedDim: Color(0xffbac3ff),
    onPrimaryFixedVariant: Color(0xff324189),

    secondaryFixed: Color(0xffffdad4),
    onSecondaryFixed: Color(0xff370d07),
    secondaryFixedDim: Color(0xffffb4a7),
    onSecondaryFixedVariant: Color(0xff6e372e),

    tertiaryFixed: Color(0xfffed8f0),
    onTertiaryFixed: Color(0xff2a1425),
    tertiaryFixedDim: Color(0xffe0bcd4),
    onTertiaryFixedVariant: Color(0xff593e52),

    surfaceDim: Color(0xffddd9d9),
    surfaceBright: Color(0xfffcf8f8),
    surfaceContainerLowest: Color(0xffffffff),
    surfaceContainerLow: Color(0xfff6f3f2),
    surfaceContainer: Color(0xfff1edec),
    surfaceContainerHigh: Color(0xffebe7e7),
    surfaceContainerHighest: Color(0xffe5e2e1),
  );
}

ColorScheme darkScheme() {
  return const ColorScheme(
    brightness: Brightness.dark,

    primary: Color(0xffbac3ff),
    surfaceTint: Color(0xffbac3ff),
    onPrimary: Color(0xff192971),
    primaryContainer: Color(0xff5f6db8),
    onPrimaryContainer: Color(0xfffaf7ff),

    secondary: Color(0xffffb4a7),
    onSecondary: Color(0xff522119),
    secondaryContainer: Color(0xff9e5e53),
    onSecondaryContainer: Color(0xfffff0ee),

    tertiary: Color(0xffe0bcd4),
    onTertiary: Color(0xff41293b),
    tertiaryContainer: Color(0xffab8aa0),
    onTertiaryContainer: Color(0xff3d2536),

    error: Color(0xffffb4ab),
    onError: Color(0xff690005),
    errorContainer: Color(0xff93000a),
    onErrorContainer: Color(0xffffdad6),

    surface: Color(0xff141313),
    onSurface: Color(0xffe5e2e1),
    onSurfaceVariant: Color(0xffc7c6cd),

    outline: Color(0xff909097),
    outlineVariant: Color(0xff46464c),

    shadow: Color(0xff000000),
    scrim: Color(0xff000000),

    inverseSurface: Color(0xffe5e2e1),
    inversePrimary: Color(0xff4b59a2),
    primaryFixed: Color(0xffdee1ff),
    onPrimaryFixed: Color(0xff001159),
    primaryFixedDim: Color(0xffbac3ff),
    onPrimaryFixedVariant: Color(0xff324189),

    secondaryFixed: Color(0xffffdad4),
    onSecondaryFixed: Color(0xff370d07),
    secondaryFixedDim: Color(0xffffb4a7),
    onSecondaryFixedVariant: Color(0xff6e372e),

    tertiaryFixed: Color(0xfffed8f0),
    onTertiaryFixed: Color(0xff2a1425),
    tertiaryFixedDim: Color(0xffe0bcd4),
    onTertiaryFixedVariant: Color(0xff593e52),

    surfaceDim: Color(0xff141313),
    surfaceBright: Color(0xff3a3939),
    surfaceContainerLowest: Color(0xff0e0e0e),
    surfaceContainerLow: Color(0xff1c1b1b),
    surfaceContainer: Color(0xff201f1f),
    surfaceContainerHigh: Color(0xff2a2a2a),
    surfaceContainerHighest: Color(0xff353434),
  );
}


final extendedColors = (
  shadow: Colors.black.withAlpha(127),
  light: Colors.white.withAlpha(63),
  powerLight: Color(0xFFE7F6FF).withAlpha(127),
);
