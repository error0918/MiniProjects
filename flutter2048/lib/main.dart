import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:provider/provider.dart';

import '/view/game_homepage.dart';
import '/view/theme.dart' as theme;
import '/viewmodel/game_view_model.dart';
import '/model/game.dart';


void main() => runApp(
    ChangeNotifierProvider(
        create: (_) => GameViewModel(),
        child: const MyApp()
    )
);


class MyApp extends StatefulWidget {
  const MyApp({super.key});

  @override
  State<MyApp> createState() => _MyAppState();
}


class _MyAppState extends State<MyApp> {
  final FocusNode _focusNode = FocusNode();
  late GameViewModel _gameViewModel;

  @override
  void initState() {
    super.initState();
    _gameViewModel = Provider.of<GameViewModel>(context, listen: false);
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter2048',
      theme: theme.light(),
      darkTheme: theme.dark(),
      home: KeyboardListener(
        focusNode: _focusNode,
        autofocus: true,
        onKeyEvent: (event) {
          if (event is KeyDownEvent) {
            switch (event.logicalKey) {
              case LogicalKeyboardKey.keyW:
              case LogicalKeyboardKey.arrowUp:
                if (_gameViewModel.ableCol) _gameViewModel.process(Direction.up);
              case LogicalKeyboardKey.keyD:
              case LogicalKeyboardKey.arrowDown:
                if (_gameViewModel.ableCol) _gameViewModel.process(Direction.down);
              case LogicalKeyboardKey.keyA:
              case LogicalKeyboardKey.arrowLeft:
                if (_gameViewModel.ableRow) _gameViewModel.process(Direction.left);
              case LogicalKeyboardKey.keyD:
              case LogicalKeyboardKey.arrowRight:
                if (_gameViewModel.ableRow) _gameViewModel.process(Direction.right);
              case LogicalKeyboardKey.shiftLeft:
              case LogicalKeyboardKey.shiftRight:
                if (_gameViewModel.free) _gameViewModel.add();
            }
          }
        },
        child: GameHomePage(),
      ),
    );
  }
}
