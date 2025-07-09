import 'dart:math';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '/view/board_widget.dart';
import '/view/controller_widget.dart';
import '/view/dialog.dart';
import '/viewmodel/game_view_model.dart';


class GameHomePage extends StatelessWidget {
  const GameHomePage({super.key});

  @override
  Widget build(BuildContext context) {
    final gameViewModel = Provider.of<GameViewModel>(context, listen: false);
    gameViewModel.addListener(() {
      if (gameViewModel.showClear) {
        showDialog(
            context: context,
            builder: (BuildContext context) {
              return ClearDialog();
            }
        );
      }
      if (gameViewModel.showGameOver) {
        showDialog(
            context: context,
            builder: (BuildContext context) {
              return GameOverDialog();
            }
        );
      }
    });

    return Scaffold(
      appBar: AppBar(
        title: Text(
          "Flutter2048",
          style: TextStyle(
            fontWeight: FontWeight.bold,
            letterSpacing: 2.0,
          ),
        ),
        centerTitle: false,
        actions: [
          IconButton(
              onPressed: () {
                showDialog(
                    context: context,
                    builder: (BuildContext context) {
                      return NewGameDialog();
                    }
                );
              },
              icon: Row(
                spacing: 4.0,
                children: [
                  Text("New"),
                  Icon(Icons.add_circle_outline_sharp)
                ],
              ),
          ),
          Consumer<GameViewModel>(builder: (context, provider, child) {
            return IconButton(
              onPressed: () => gameViewModel.changeThemeMode(),
              icon: Icon(
                  provider.themeMode == ThemeMode.light ? Icons.brightness_7_rounded :Icons.brightness_2_rounded
              ),
            );
          }),
          SizedBox(width: 12.0),
        ],
      ),
      body: Padding(
          padding: EdgeInsets.all(16.0),
          child: Center(
            child: LayoutBuilder(
                builder: (BuildContext context, BoxConstraints boxConstraints) {
                  final (width, height) = (boxConstraints.maxWidth, boxConstraints.maxHeight);
                  if (width <= height) {
                    return Column(
                      spacing: 16.0,
                      children: [
                        BoardWidget(size: min(width, height - 200 - 16)),
                        ControllerWidget(size: min(max(height - width - 16, 200.0), width)),
                      ],
                    );
                  } else {
                    return Row(
                      spacing: 16.0,
                      children: [
                        BoardWidget(size: min(height, width - 200 - 16)),
                        ControllerWidget(size: min(max(width - height - 16, 200.0), height)),
                      ],
                    );
                  }
                }
            ),
          )
      ),
    );
  }
}
