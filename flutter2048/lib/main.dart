import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import './theme.dart' as theme;


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
      home: const MyHomePage(),
    );
  }
}


class MyHomePage extends StatelessWidget {
  const MyHomePage({super.key});

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
                if (kDebugMode) {
                  print("Icon Button Pressed");
                }
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
                      BoardWidget(size: width < height - 150 ? width : height - 150),
                      ControllerWidget(),
                    ],
                  );
                } else {
                  return Row(
                    spacing: 16.0,
                    children: [
                      BoardWidget(size: height < width - 150 ? height : width - 150),
                      ControllerWidget(),
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


class BoardWidget extends StatefulWidget {
  const BoardWidget({super.key, required this.size});

  final double size;

  @override
  createState() => _BoardWidgetState();
}

class _BoardWidgetState extends State<BoardWidget> {
  @override
  Widget build(BuildContext context) {
    return Container(
      width: widget.size,
      height: widget.size,
      decoration: BoxDecoration(
        color: Theme.of(context).primaryColor,
        borderRadius: BorderRadius.circular(12.0),
      ),
    );
  }
}


class ControllerWidget extends StatefulWidget {
  const ControllerWidget({super.key});

  @override
  createState() => _ControllerWidgetState();
}

class _ControllerWidgetState extends State<ControllerWidget> {
  @override
  Widget build(BuildContext context) {
    return Expanded(
        child: Container(
          decoration: BoxDecoration(
            color: Theme.of(context).colorScheme.primaryContainer,
            borderRadius: BorderRadius.circular(12.0),
          ),
        )
    );
  }
}

