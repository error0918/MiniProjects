import 'package:collection/collection.dart';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '/model/game.dart';
import '/viewmodel/game_view_model.dart';
import '/view/theme.dart' as theme;


class BoardWidget extends StatefulWidget {
  const BoardWidget({super.key, required this.size});

  final double size;

  @override
  createState() => _BoardWidgetState();
}


class _BoardWidgetState extends State<BoardWidget> {
  late GameViewModel _gameViewModel;
  late double _itemSize;
  late double _itemPadding;
  late double _itemFontSize;

  void _calculateSizes() {
    _itemSize = widget.size / (_gameViewModel.size + 0.2 * (_gameViewModel.size + 1));
    _itemPadding = 0.2 * _itemSize;
    _itemFontSize = 1.0 / 3.0 * _itemSize;
  }

  @override
  void initState() {
    super.initState();
    _gameViewModel = Provider.of<GameViewModel>(context, listen: false);
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
      child: Consumer<GameViewModel>(builder: (context, provider, child) {
        _calculateSizes();
        return Stack(
          children: [
            Padding(
              padding: EdgeInsets.all(_itemPadding),
              child: Row(
                spacing: _itemPadding,
                children: List<Widget>.generate(_gameViewModel.size, (_) {
                  return Column(
                      spacing: _itemPadding,
                      children: List<Widget>.generate(_gameViewModel.size, (_) {
                        return Container(
                          width: _itemSize,
                          height: _itemSize,
                          decoration: BoxDecoration(
                            color: Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(31),
                            borderRadius: BorderRadius.circular(12.0),
                          ),
                        );
                      })
                  );
                }),
              ),
            ),
            ..._gameViewModel.board
                .mapIndexed((rowIndex, row) => row.mapIndexed((colIndexed, item) => (item, rowIndex, colIndexed)))
                .expand((row) => row)
                .where((item) => item.$1.number != 0)
                .map((item) {
              final tile = item.$1;
              return AnimatedPositioned(
                key: ValueKey(tile.id),
                top: _itemSize * item.$2 + _itemPadding * (item.$2 + 1),
                left: _itemSize * item.$3 + _itemPadding * (item.$3 + 1),
                duration: Duration(milliseconds: 100),
                curve: Curves.easeOutBack,
                child: _tileWidget(tile),
              );
            })
          ],
        );
      }),
    );
  }

  Widget _tileWidget(Tile tile) {
    return Container(
      width: _itemSize,
      height: _itemSize,
      decoration: BoxDecoration(
        color: theme.ExtendedColor.get(tile.number).of(context).color,
        border: Border.all(
            width: 4,
            color: Theme.of(context).brightness == Brightness.light ? Colors.transparent : Theme.of(context).colorScheme.onPrimary
        ),
        borderRadius: BorderRadius.circular(12.0),
      ),
      child: Center(
        child: Text(
          tile.number.toString(),
          maxLines: 1,
          style: TextStyle(
            color: theme.ExtendedColor.get(tile.number).of(context).onColor,
            fontSize: _itemFontSize * (tile.number.toString().length < 4 ? 1.0 : 3.0 / tile.number.toString().length),
            fontWeight: FontWeight.bold,
          ),
        ),
      ),
    );
  }
}
