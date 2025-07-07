import 'dart:math';
import 'package:flutter/material.dart';
import './theme.dart' as theme;
import './theme.dart' show ExtendedColor;


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


class BoardWidget extends StatefulWidget {
  const BoardWidget({super.key, required this.size});

  final double size;

  @override
  createState() => _BoardWidgetState();
}

class _BoardWidgetState extends State<BoardWidget> {

  final int _itemNumber = 4;
  late double _itemSize;
  late double _itemPadding;
  late double _itemFontSize;

  void _calculateSizes() {
    _itemSize = widget.size / (_itemNumber + 0.2 * (_itemNumber + 1));
    _itemPadding = 0.2 * _itemSize;
    _itemFontSize = 1.0 / 3.0 * _itemSize;
  }

  @override
  void initState() {
    super.initState();
    _calculateSizes();
  }

  @override
  void didUpdateWidget(BoardWidget oldWidget) {
    super.didUpdateWidget(oldWidget);
    if (widget.size != oldWidget.size) {
      _calculateSizes();
      setState(() {});
    }
  }

  @override
  Widget build(BuildContext context) {
    return Container(
      width: widget.size,
      height: widget.size,
      decoration: BoxDecoration(
        color: Theme.of(context).colorScheme.primary,
        borderRadius: BorderRadius.circular(12.0),
      ),
      child: Padding(
        padding: EdgeInsets.all(_itemPadding),
        child: Row(
          spacing: _itemPadding,
          children: List<Widget>.generate(_itemNumber, (int rowIndex) {
            return Column(
                spacing: _itemPadding,
                children: List<Widget>.generate(_itemNumber, (int colIndex) {
                  if (rowIndex == 2 && colIndex == 3) {
                    return Container(
                      width: _itemSize,
                      height: _itemSize,
                      decoration: BoxDecoration(
                        color: ExtendedColor.color16.of(context).color,
                        border: Border.all(
                            width: 4,
                            color: Theme.of(context).brightness == Brightness.light ? Colors.transparent
                                : Theme.of(context).colorScheme.onPrimary
                        ),
                        borderRadius: BorderRadius.circular(12.0),
                      ),
                      child: Center(
                        child: Text(
                          "16",
                          maxLines: 1,
                          style: TextStyle(
                              color: ExtendedColor.color16.of(context).onColor,
                              fontSize: _itemFontSize,
                              fontWeight: FontWeight.bold,
                          ),
                        ),
                      ),
                    );
                  } else if (rowIndex == 0 && colIndex == 2) {
                    return Container(
                      width: _itemSize,
                      height: _itemSize,
                      decoration: BoxDecoration(
                        color: ExtendedColor.color2.of(context).color,
                        border: Border.all(
                          width: 4,
                          color: Theme.of(context).brightness == Brightness.light ? Colors.transparent
                              : Theme.of(context).colorScheme.onPrimary
                        ),
                        borderRadius: BorderRadius.circular(12.0),
                      ),
                      child: Center(
                        child: Text(
                          "2",
                          maxLines: 1,
                          style: TextStyle(
                            color: ExtendedColor.color2.of(context).onColor,
                            fontSize: _itemFontSize,
                            fontWeight: FontWeight.bold,
                          ),
                        ),
                      ),
                    );
                  } else {
                    return Container(
                      width: _itemSize,
                      height: _itemSize,
                      decoration: BoxDecoration(
                        color: Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(31),
                        borderRadius: BorderRadius.circular(12.0),
                      ),
                    );
                  }
                })
            );
          }),
        ),
      ),
    );
  }
}


class ControllerWidget extends StatefulWidget {
  const ControllerWidget({super.key, this.size = 0.0});

  final double size;

  @override
  createState() => _ControllerWidgetState();
}

class _ControllerWidgetState extends State<ControllerWidget> {
  @override
  Widget build(BuildContext context) {
    final iconSize = 24.0 * (0.75 + widget.size / 600.0);

    return Expanded(
        child: Container(
            decoration: BoxDecoration(
              color: Theme.of(context).colorScheme.surfaceContainer,
              borderRadius: BorderRadius.circular(12.0),
            ),
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Transform.translate(
                  offset: Offset(0, 0.5),
                  child: ControlButton(
                    onPressed: () {
                      print("Up Button Pressed");
                    },
                    icon: Icons.arrow_drop_up,
                    iconSize: iconSize,
                    radiusTopLeft: 12,
                    radiusTopRight: 12,
                  ),
                ),
                Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    Transform.translate(
                      offset: Offset(0.5, 0),
                      child: ControlButton(
                        onPressed: () {
                          print("Left Button Pressed");
                        },
                        icon: Icons.arrow_left,
                        iconSize: iconSize,
                        radiusTopLeft: 12,
                        radiusBottomLeft: 12,
                      ),
                    ),
                    ControlButton(
                      onPressed: () {
                        print("Center Button Pressed");
                      },
                      icon: Icons.circle,
                      iconSize: iconSize * 0.75,
                      paddingSize: iconSize * 11.0 / 24.0,
                    ),
                    Transform.translate(
                      offset: Offset(-0.5, 0),
                      child: ControlButton(
                        onPressed: () {
                          print("Right Button Pressed");
                        },
                        icon: Icons.arrow_right,
                        iconSize: iconSize,
                        radiusTopRight: 12,
                        radiusBottomRight: 12,
                      ),
                    ),
                  ],
                ),
                Transform.translate(
                  offset: Offset(0, -0.5),
                  child: ControlButton(
                    onPressed: () {
                      print("Down Button Pressed");
                    },
                    icon: Icons.arrow_drop_down,
                    iconSize: iconSize,
                    radiusBottomLeft: 12,
                    radiusBottomRight: 12,
                  ),
                ),
              ],
            ),
        )
    );
  }
}


class ControlButton extends StatelessWidget {
  const ControlButton({
    super.key,
    required this.onPressed,
    required this.icon,
    required this.iconSize,
    this.paddingSize,
    this.radiusTopLeft = 0.0,
    this.radiusTopRight = 0.0,
    this.radiusBottomLeft = 0.0,
    this.radiusBottomRight = 0.0,
  });

  final VoidCallback? onPressed;
  final IconData icon;
  final double iconSize;
  final double? paddingSize;
  final double radiusTopLeft, radiusTopRight, radiusBottomLeft, radiusBottomRight;

  @override
  Widget build(BuildContext context) {
    return FilledButton(
      onPressed: onPressed,
      style: FilledButton.styleFrom(
        foregroundColor: Theme.of(context).colorScheme.onPrimary,
        backgroundColor: Theme.of(context).colorScheme.primary,
        disabledForegroundColor: Theme.of(context).colorScheme.primaryContainer,
        disabledBackgroundColor: Theme.of(context).colorScheme.onPrimaryContainer,
        minimumSize: Size(0, 0),
        padding: EdgeInsets.zero,
        shape: RoundedRectangleBorder(
            borderRadius: BorderRadius.only(
              topLeft: Radius.circular(radiusTopLeft),
              topRight: Radius.circular(radiusTopRight),
              bottomLeft: Radius.circular(radiusBottomLeft),
              bottomRight: Radius.circular(radiusBottomRight),
            )
        ),
      ),
      child: Padding(
        padding: EdgeInsets.all(paddingSize ?? iconSize / 3.0),
        child: Icon(
          icon,
          size: iconSize,
        ),
      ),
    );
  }
}
