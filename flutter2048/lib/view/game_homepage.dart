import 'dart:math';
import 'package:flutter/material.dart';
import 'package:flutter2048/viewmodel/game_view_model.dart';
import 'package:provider/provider.dart';

import '/view/board_widget.dart';
import '/view/controller_widget.dart';


class GameHomePage extends StatelessWidget {
  const GameHomePage({super.key});

  @override
  Widget build(BuildContext context) {
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
              )
          )
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
                        BoardWidget(size: min(width, height - 180 - 16)),
                        ControllerWidget(size: min(max(height - width - 16, 180.0), width)),
                      ],
                    );
                  } else {
                    return Row(
                      spacing: 16.0,
                      children: [
                        BoardWidget(size: min(height, width - 180 - 16)),
                        ControllerWidget(size: min(max(width - height - 16, 180.0), height)),
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


class NewGameDialog extends StatefulWidget {
  const NewGameDialog({super.key});

  @override
  createState() => _NewGameDialogState();
}


class _NewGameDialogState extends State<NewGameDialog> {
  late GameViewModel _gameViewModel;
  int sliderValue = 4;

  @override
  void initState() {
    super.initState();
    _gameViewModel = Provider.of<GameViewModel>(context, listen: false);
    sliderValue = _gameViewModel.size;
  }

  @override
  Widget build(BuildContext context) {
    return AlertDialog(
      title: Text("Play New Game"),
      content: Column(
        mainAxisSize: MainAxisSize.min,
        children: [
          SizedBox(
            height: 24.0,
          ),
          Slider(
            value: sliderValue.toDouble(),
            min: 4,
            max: 8,
            divisions: 4,
            year2023: false,
            label: sliderValue.toString(),
            onChanged: (value) { setState(() { sliderValue = value.toInt(); }); },
          ),
        ],
      ),
      actions: [
        TextButton(
            onPressed: () => Navigator.of(context).pop(),
            child: Text("Cancel")
        ),
        TextButton(
            onPressed: () {
              _gameViewModel.playNewGame(size: sliderValue);
              Navigator.of(context).pop();
            },
            child: Text("Play")
        )
      ],
    );
  }
}
