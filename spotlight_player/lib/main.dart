import 'package:flutter/material.dart';
import 'player_page.dart';
import 'theme.dart' as theme;


void main() => runApp(const MyApp());


class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'SpotlightPlayer',
      debugShowCheckedModeBanner: false,
      theme: theme.light(),
      darkTheme: theme.dark(),
      themeMode: ThemeMode.light,
      home: const PlayerPage(),
    );
  }
}
