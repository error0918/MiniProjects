import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '/viewmodel/game_view_model.dart';


class Wow extends StatefulWidget {
  const Wow({super.key});

  @override
  createState() => _WowState();
}

class _WowState extends State<Wow>
    with SingleTickerProviderStateMixin {
  late Animation<double> _animation;
  late AnimationController _controller;
  bool _clear = false;
  int _targetSlot = 1;
  int? _slot1, _slot2, _slot3;
  double? _slot1Y, _slot2Y, _slot3Y;

  @override
  void initState() {
    super.initState();
    _controller = AnimationController(
      duration: const Duration(milliseconds: 500),
      vsync: this,
    );
    _animation = Tween(begin: 0.0, end: 70.0 * 3).animate(_controller)
      ..addListener(() {
        if (_controller.isCompleted) _controller.repeat();
        setState(() {});
      });
    _controller.forward();
  }

  @override
  Widget build(BuildContext context) {
    final gameViewModel = Provider.of<GameViewModel>(context, listen: false);
    final Widget title = Text(
      "🤹 HAHA777!!!",
      style: TextStyle(
        fontSize: 24.0,
        fontWeight: FontWeight.bold,
        color: Colors.white,
      ),
    );

    return Dialog(
      child: Container(
        padding: EdgeInsets.all(24.0),
        decoration: _clear ? BoxDecoration(
          gradient: LinearGradient(
            colors: [Colors.red, Colors.deepOrange, Colors.green, Colors.blue, Colors.purple],
            begin: Alignment.topLeft,
            end: Alignment.bottomRight,
          ),
          borderRadius: BorderRadius.all(Radius.circular(12.0)),
        ) : null,
        child: IntrinsicWidth(
          child: Column(
            mainAxisSize: MainAxisSize.min,
            spacing: 12.0,
            children: [
              Row(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: [
                  if (_clear)
                    ...[
                      title,
                      FilledButton(
                        onPressed: () => gameViewModel.wowMode(),
                        style: FilledButton.styleFrom(
                          minimumSize: Size(0.0, 0.0),
                          padding: EdgeInsets.all(12.0),
                          foregroundColor: Colors.black,
                          backgroundColor:  Colors.white,
                        ),
                        child: Text("!"),
                      )
                    ]
                  else
                    ShaderMask(
                      shaderCallback: (bounds) {
                        return LinearGradient(
                          colors: [Colors.red, Colors.deepOrange, Colors.green, Colors.blue, Colors.purple],
                        ).createShader(Rect.fromLTWH(0, 0, bounds.width, bounds.height));
                      },
                      blendMode: BlendMode.srcIn,
                      child: title,
                    ),
                ],
              ),
              Row(
                spacing: 18,
                children: [
                  _slot(_slot1Y ?? _animation.value),
                  _slot(_slot2Y ?? _animation.value),
                  _slot(_slot3Y ?? _animation.value),
                ],
              ),
              if (_targetSlot < 4)
                FilledButton(
                  onPressed: () async {
                    setState(() { _targetSlot++; });
                    if (_targetSlot - 1 == 1) {
                      while (_targetSlot != 0) {
                        if (_animation.value % 70 < 5) {
                          _slot1 = (_animation.value / 70.0).floor();
                          _slot1Y = _slot1! * 70.0;
                          break;
                        }
                        await Future.delayed(const Duration(milliseconds: 20));
                      }
                    } else if (_targetSlot - 1 == 2) {
                      while (_targetSlot != 0) {
                        if (_animation.value % 70 < 5) {
                          _slot2 = (_animation.value / 70.0).floor();
                          _slot2Y = _slot2! * 70.0;
                          break;
                        }
                        await Future.delayed(const Duration(milliseconds: 20));
                      }
                    } else {
                      while (_targetSlot != 0) {
                        if (_animation.value % 70 < 5) {
                          _slot3 = (_animation.value / 70.0).floor();
                          _slot3Y = _slot3! * 70.0;
                          if (_slot1 == 2 && _slot2 == 2 && _slot3 == 2) {
                            _clear = true;
                          }
                          break;
                        }
                        await Future.delayed(const Duration(milliseconds: 20));
                      }
                    }
                  },
                  child: Text("S T O P"),
                )
              else if (_slot1 == 2 && _slot2 == 2 && _slot3 == 2)
                FilledButton(
                  onPressed: () {
                    setState(() {
                      _controller.stop();
                      Navigator.of(context).pop();
                    });
                  },
                  style: FilledButton.styleFrom(
                    foregroundColor: Colors.black,
                    backgroundColor:  Colors.white,
                  ),
                  child: Text("C L O S E"),
                )
              else
                FilledButton(
                  onPressed: () {
                    setState(() {
                      _targetSlot = 1;
                      _slot1 = null;
                      _slot2 = null;
                      _slot3 = null;
                      _slot1Y = null;
                      _slot2Y = null;
                      _slot3Y = null;
                    });
                  },
                  child: Text("R E T R Y"),
                ),
            ],
          ),
        ),
      ),
    );
  }

  Widget _slot(double y) {
    return Expanded(
      flex: 1,
      child: Container(
        height: 70.0,
        clipBehavior: Clip.hardEdge,
        decoration: BoxDecoration(
          border: Border.all(
            width: 4.0,
            color: _clear ? Colors.white : Theme.of(context).colorScheme.onSurface,
          ),
        ),
        child: Stack(
          children: [
            Positioned(
              top: -y,
              left: 0,
              right: 0,
              child: Column(
                children: List.generate(4, (i) {
                  return SizedBox(
                    height: 70.0,
                    child: Center(
                      child: Text(
                        ["💣", "😖", "7️⃣"][i % 3],
                        textScaler: TextScaler.linear(2.0),
                      ),
                    ),
                  );
                }),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
