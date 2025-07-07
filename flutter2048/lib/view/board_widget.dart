import 'package:flutter/material.dart';
import 'package:flutter2048/viewmodel/game_view_model.dart';
import 'package:provider/provider.dart';

import 'theme.dart' as theme;


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
        child: Consumer<GameViewModel>(builder: (context, provider, child) {
          return Row(
            spacing: _itemPadding,
            children: List<Widget>.generate(_itemNumber, (int rowIndex) {
              return Column(
                  spacing: _itemPadding,
                  children: List<Widget>.generate(_itemNumber, (int colIndex) {
                    final block = provider.board[rowIndex][colIndex];
                    if (block != 0) {
                      return Container(
                        width: _itemSize,
                        height: _itemSize,
                        decoration: BoxDecoration(
                          color: theme.ExtendedColor.get(block).of(context).color,
                          border: Border.all(
                              width: 4,
                              color: Theme.of(context).brightness == Brightness.light ? Colors.transparent : Theme.of(context).colorScheme.onPrimary
                          ),
                          borderRadius: BorderRadius.circular(12.0),
                        ),
                        child: Center(
                          child: Text(
                            block.toString(),
                            maxLines: 1,
                            style: TextStyle(
                              color: theme.ExtendedColor.get(block).of(context).onColor,
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
          );
        }),
      ),
    );
  }
}
