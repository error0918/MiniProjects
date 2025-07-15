import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '/player_viewmodel.dart';
import '/view/player_page.dart';
import '/view/theme.dart' as theme;


void main() => runApp(const MyApp());


class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return ChangeNotifierProvider(
        create: (_) => PlayerViewModel(),
        lazy: false,
        child: MaterialApp(
          title: 'SpotlightPlayer',
          debugShowCheckedModeBanner: false,
          theme: theme.light(),
          darkTheme: theme.dark(),
          themeMode: ThemeMode.light,
          home: const PlayerPage(),
        )
    );
  }
}
