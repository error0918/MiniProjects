import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import 'view/game_homepage.dart';
import 'view/theme.dart' as theme;
import 'viewmodel/game_view_model.dart';


void main() => runApp(const MyApp());


class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter2048',
      theme: theme.light(),
      darkTheme: theme.dark(),
      themeMode: ThemeMode.light,
      home: ChangeNotifierProvider(
        create: (_) => GameViewModel(),
        child: GameHomePage(),
      ),
    );
  }
}
