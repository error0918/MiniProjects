import 'dart:io' show Platform;
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:window_size/window_size.dart';
import '/player_viewmodel.dart';
import '/view/player_page.dart';
import '/view/theme.dart' as theme;


void main() {
  WidgetsFlutterBinding.ensureInitialized();
  if (Platform.isWindows || Platform.isMacOS || Platform.isLinux) {
    setWindowTitle("SpotlightPlayer");
    setWindowMinSize(Size(360, 720));
  }
  runApp(const MyApp());
}


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
