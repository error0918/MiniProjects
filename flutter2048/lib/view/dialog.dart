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
                min: 4,
                max: 8,
                divisions: 4,
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
                min: 4,
                max: 8,
                divisions: 4,
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
