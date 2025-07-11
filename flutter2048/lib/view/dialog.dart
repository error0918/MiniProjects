import 'dart:math';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:url_launcher/url_launcher.dart';

import '/viewmodel/game_view_model.dart';


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
          SizedBox(height: 24.0),
          Row(
            mainAxisSize: MainAxisSize.max,
            mainAxisAlignment: MainAxisAlignment.center,
            crossAxisAlignment: CrossAxisAlignment.center,
            children: [
              SizedBox(width: 16.0),
              Text("Board Size"),
              Slider(
                value: sliderValue.toDouble(),
                min: 2,
                max: 10,
                divisions: 8,
                year2023: false,
                label: sliderValue.toString(),
                onChanged: (value) { setState(() { sliderValue = value.toInt(); }); },
              ),
            ],
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
        ),
      ],
    );
  }
}


class ClearDialog extends StatefulWidget {
  const ClearDialog({super.key});

  @override
  createState() => _ClearDialogState();
}


class _ClearDialogState extends State<ClearDialog> {
  late GameViewModel _gameViewModel;
  int sliderValue = 4;

  Future<void> launchLink(BuildContext context, String link) async {
    final url = Uri.parse(link);
    if (await canLaunchUrl(url)) launchUrl(url, mode: LaunchMode.externalApplication);
    if (context.mounted) Navigator.of(context).pop();
  }

  @override
  void initState() {
    super.initState();
    _gameViewModel = Provider.of<GameViewModel>(context, listen: false);
    sliderValue = _gameViewModel.size;
  }

  @override
  Widget build(BuildContext context) {
    return AlertDialog(
      title: Text("Clear!"),
      content: Column(
        mainAxisSize: MainAxisSize.min,
        crossAxisAlignment: CrossAxisAlignment.center,
        spacing: 8.0,
        children: [
          Container(
            height: 100.0,
            decoration: BoxDecoration(
                borderRadius: BorderRadius.all(Radius.circular(12.0)),
                image: DecorationImage(
                    fit: BoxFit.fill,
                    image: AssetImage('assets/wow.gif')
                )
            ),
          ),
          Text("Thanks for Playing!"),
        ],
      ),
      actions: [
        TextButton(
            onPressed: () => Navigator.of(context).pop(),
            child: Text("Dismiss")
        ),
        TextButton(
            onPressed: () async => launchLink(context, "https://github.com/jtaeyeon05"),
            child: Text("Open GitHub")
        ),
      ],
    );
  }
}


class GameOverDialog extends StatefulWidget {
  const GameOverDialog({super.key});

  @override
  createState() => _GameOverDialogState();
}


class _GameOverDialogState extends State<GameOverDialog> {
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
      title: Text("Game Over!"),
      content: Column(
        mainAxisSize: MainAxisSize.min,
        children: [
          Container(
            height: 250.0,
            decoration: BoxDecoration(
                borderRadius: BorderRadius.all(Radius.circular(12.0)),
                image: DecorationImage(
                    fit: BoxFit.fill,
                    image: AssetImage('assets/rickroll.gif')
                )
            ),
          ),
          SizedBox(height: 24.0),
          Row(
            mainAxisSize: MainAxisSize.max,
            mainAxisAlignment: MainAxisAlignment.center,
            crossAxisAlignment: CrossAxisAlignment.center,
            children: [
              SizedBox(width: 16.0),
              Text("Board Size"),
              Slider(
                value: sliderValue.toDouble(),
                min: 2,
                max: 10,
                divisions: 8,
                year2023: false,
                label: sliderValue.toString(),
                onChanged: (value) { setState(() { sliderValue = value.toInt(); }); },
              ),
            ],
          ),
        ],
      ),
      actions: [
        TextButton(
            onPressed: () => Navigator.of(context).pop(),
            child: Text("Dismiss")
        ),
        TextButton(
            onPressed: () {
              _gameViewModel.playNewGame(size: sliderValue);
              Navigator.of(context).pop();
            },
            child: Text("Replay")
        ),
      ],
    );
  }
}


class SetBoardDialog extends StatefulWidget {
  const SetBoardDialog({super.key});

  @override
  createState() => _SetBoardDialogState();
}


class _SetBoardDialogState extends State<SetBoardDialog> {
  late GameViewModel _gameViewModel;
  List<(int, int, int)> newBoard = [];
  int selectedRow = 0, selectedColumn = 0;

  @override
  void initState() {
    super.initState();
    _gameViewModel = Provider.of<GameViewModel>(context, listen: false);

    final board = _gameViewModel.board;
    for (int i  = 0; i < _gameViewModel.size; i++) {
      for (int j  = 0; j < _gameViewModel.size; j++) {
        newBoard.add((board[i][j].number, i, j));
      }
    }
  }

  @override
  Widget build(BuildContext context) {
    return AlertDialog(
      title: Text("Set the Board"),
      content: Column(
        mainAxisSize: MainAxisSize.min,
        spacing: 12.0,
        children: [
          Container(
            padding: EdgeInsets.all(12.0),
            decoration: BoxDecoration(
              color: Theme.of(context).colorScheme.primaryContainer,
              borderRadius: BorderRadius.all(Radius.circular(12.0))
            ),
            child: Column(
              spacing: 12.0,
              children: List<Row>.generate(_gameViewModel.size, (rowIndex) {
                return Row(
                  spacing: 12.0,
                  children: List.generate(_gameViewModel.size, (columnIndex) {
                    final selected = rowIndex == selectedRow && columnIndex == selectedColumn;
                    return Expanded(
                      flex: 1,
                      child: FilledButton(
                        onPressed: () {
                          setState(() {
                            selectedRow = rowIndex;
                            selectedColumn = columnIndex;
                          });
                        },
                        style: FilledButton.styleFrom(
                          foregroundColor: selected ? Theme.of(context).colorScheme.onSecondary : Theme.of(context).colorScheme.onPrimary,
                          backgroundColor: selected ? Theme.of(context).colorScheme.secondary : Theme.of(context).colorScheme.primary,
                          minimumSize: Size(0.0, 48.0),
                          padding: EdgeInsets.zero,
                          shape: RoundedRectangleBorder(
                              borderRadius: BorderRadius.only(
                                topLeft: Radius.circular(6.0),
                                topRight: Radius.circular(6.0),
                                bottomLeft: Radius.circular(6.0),
                                bottomRight: Radius.circular(6.0),
                              )
                          ),
                        ),
                        child: Padding(
                          padding: EdgeInsets.all(6.0),
                          child: FittedBox(
                            fit: BoxFit.scaleDown,
                            child: Text(
                              newBoard[rowIndex * _gameViewModel.size + columnIndex].$1.toString(),
                              textAlign: TextAlign.center,
                            ),
                          ),
                        )
                      ),
                    );
                  }),
                );
              }),
            ),
          ),
          (() {
            final targetNumber = newBoard[selectedRow * _gameViewModel.size + selectedColumn].$1;
            final targetIndex = selectedRow * _gameViewModel.size + selectedColumn;
            return Row(
              mainAxisAlignment: MainAxisAlignment.center,
              spacing: 12.0,
              children: [
                FilledButton(
                  onPressed: targetNumber == 0 ? null
                      : () {
                    setState(() {
                      newBoard[targetIndex] = targetNumber == 2
                          ? (0, selectedRow, selectedColumn)
                          : ((targetNumber / 2).toInt(), selectedRow, selectedColumn);
                    });
                  },
                  child: Text("-"),
                ),
                Text(targetNumber.toString()),
                FilledButton(
                  onPressed: targetNumber == pow(2, 31) ? null
                      : () {
                    setState(() {
                      newBoard[targetIndex] = targetNumber == 0
                          ? (2, selectedRow, selectedColumn)
                          : (targetNumber * 2, selectedRow, selectedColumn);
                    });
                  },
                  child: Text("+"),
                ),
              ],
            );
          })(),
        ],
      ),
      actions: [
        TextButton(
            onPressed: () => Navigator.of(context).pop(),
            child: Text("Dismiss")
        ),
        TextButton(
            onPressed: () {
              _gameViewModel.set(newBoard, true);
              Navigator.of(context).pop();
            },
            child: Text("Replay")
        ),
      ],
    );
  }
}
