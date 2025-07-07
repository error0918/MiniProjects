import 'dart:math';
import 'package:flutter/material.dart';

import 'board_widget.dart';
import 'controller_widget.dart';


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
                print("Icon Button Pressed");
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
