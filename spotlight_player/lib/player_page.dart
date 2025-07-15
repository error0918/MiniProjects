import 'dart:math';
import 'dart:ui';
import 'package:collection/collection.dart';
import 'package:flutter/material.dart';
import 'package:flutter/scheduler.dart';
import 'package:flutter/services.dart';


class PlayerPage extends StatelessWidget {
  const PlayerPage({super.key});

  @override
  Widget build(BuildContext context) {
    SystemChrome.setSystemUIOverlayStyle(SystemUiOverlayStyle(
      statusBarIconBrightness: Brightness.dark,
    ));
    return Scaffold(
      body: LayoutBuilder(
        builder: (BuildContext context, BoxConstraints boxConstraints) {
          return Stack(
            children: [
              BackgroundContainer(
                width: boxConstraints.maxWidth,
                height: boxConstraints.maxHeight,
              ),
              SafeArea(
                child: PlayerContainer(),
              ),
            ],
          );
        },
      ),
    );
  }
}


class BackgroundContainer extends StatefulWidget {
  final double width;
  final double height;
  double get size => width < height ? (width + 2 * height) / 3 : (2 * width + height) / 3;

  const BackgroundContainer({super.key, required this.width, required this.height});

  @override
  State<BackgroundContainer> createState() => _BackgroundContainerState();
}


class _AnimationSet {
  double minSize, maxSize;
  late AnimationController controllerX, controllerY, controllerSize;
  late Animation<double> animationX, animationY, animationSize;

  _AnimationSet({
    required this.minSize, required this.maxSize,
    required this.controllerX, required this.controllerY, required this.controllerSize,
  });
}


class _BackgroundContainerState extends State<BackgroundContainer> with TickerProviderStateMixin {
  final _random = Random();
  final List<_AnimationSet> _animationList = [];
  late final Ticker _ticker;
  Duration _lastTick = Duration.zero;

  final int _moveDuration = 12000;
  final int _sizeDuration = 18000;
  final int _durationBase = 2000;

  AnimationController _makeController(int duration) {
    return AnimationController(
        duration: Duration(milliseconds: _random.nextInt(duration) + _durationBase),
        vsync: this
    );
  }

  Animation<double> _makeMoveAnimation(AnimationController controller) {
    return Tween(begin: 0.0, end: 1.0).animate(controller)
      ..addListener(() {
        if (controller.isCompleted) {
          controller.duration = Duration(milliseconds: _random.nextInt(_moveDuration) + _durationBase);
          controller.reverse();
        } else if (controller.isDismissed) {
          controller.duration = Duration(milliseconds: _random.nextInt(_moveDuration) + _durationBase);
          controller.forward();
        }
      });
  }

  @override
  void initState() {
    super.initState();

    final minSize = widget.size * 1 / 4 + _random.nextDouble() * widget.size / 4;
    final maxSize = widget.size * 2 / 4 + _random.nextDouble() * widget.size / 4;

    for (int i = 0; i < 9; i++) {
      final animationSet = _AnimationSet(
        minSize: minSize,
        maxSize: maxSize,
        controllerX: _makeController(_moveDuration),
        controllerY: _makeController(_moveDuration),
        controllerSize: _makeController(_sizeDuration),
      );

      animationSet.animationX = _makeMoveAnimation(animationSet.controllerX);
      animationSet.animationY = _makeMoveAnimation(animationSet.controllerY);
      animationSet.animationSize = Tween(begin: animationSet.minSize, end: animationSet.maxSize)
          .animate(animationSet.controllerSize)
        ..addListener(() {
          if (animationSet.controllerSize.isCompleted) {
            animationSet.controllerSize.duration = Duration(milliseconds: _random.nextInt(_sizeDuration) + _durationBase);
            animationSet.minSize = widget.size * 1 / 4 + _random.nextDouble() * widget.size / 4;
            animationSet.animationSize = Tween(begin: animationSet.minSize, end: animationSet.maxSize).animate(animationSet.controllerSize);
            animationSet.controllerSize.reverse();
          } else if (animationSet.controllerSize.isDismissed) {
            animationSet.controllerSize.duration = Duration(milliseconds: _random.nextInt(_sizeDuration) + _durationBase);
            animationSet.maxSize = widget.size * 1 / 4 + _random.nextDouble() * widget.size / 4;
            animationSet.animationSize = Tween(begin: animationSet.minSize, end: animationSet.maxSize).animate(animationSet.controllerSize);
            animationSet.controllerSize.forward();
          }
        });

      if (_random.nextInt(2) == 0) {
        animationSet.controllerX.forward(from: _random.nextDouble());
      } else {
        animationSet.controllerX.reverse(from: _random.nextDouble());
      }
      if (_random.nextInt(2) == 0) {
        animationSet.controllerY.forward(from: _random.nextDouble());
      } else {
        animationSet.controllerY.reverse(from: _random.nextDouble());
      }
      animationSet.controllerSize.forward();

      _animationList.add(animationSet);
    }

    _ticker = Ticker((elapsed) {
      if (elapsed - _lastTick >= Duration(milliseconds: 33)) {
        _lastTick = elapsed;
        setState(() {});
      }
    });
    _ticker.start();
  }

  @override
  void dispose() {
    _ticker.dispose();
    super.dispose();
  }

  @override
  void didUpdateWidget(BackgroundContainer oldWidget) {
    super.didUpdateWidget(oldWidget);
    if (widget.width != oldWidget.width || widget.height != widget.height) {
      setState(() {});
    }
  }

  @override
  Widget build(BuildContext context) {
    return Stack(
      children: [
        Positioned.fill(
          child: BackdropFilter(
            filter: ImageFilter.blur(
              sigmaX: widget.size / 3,
              sigmaY: widget.size / 3,
            ),
            child: Container(color: Colors.transparent),
          ),
        ),
        Positioned.fill(
          child: Container(color: Colors.black.withAlpha(31)),
        ),
        ..._animationList.mapIndexed((index, animationSet) {
          return Positioned(
            left: widget.width * animationSet.animationX.value - animationSet.animationSize.value * 2 / 3,
            top: widget.height * animationSet.animationY.value - animationSet.animationSize.value * 2 / 3,
            child: Container(
              width: animationSet.animationSize.value,
              height: animationSet.animationSize.value,
              decoration: BoxDecoration(
                color: [
                  Theme.of(context).colorScheme.primary,
                  Theme.of(context).colorScheme.secondary,
                  Theme.of(context).colorScheme.tertiary,
                ][index % 3].withAlpha(95),
                shape: BoxShape.circle,
              ),
            ),
          );
        }),
        Positioned.fill(
          child: Container(color: Theme.of(context).colorScheme.primaryContainer),
        ),
      ].reversed.toList(),
    );
  }
}


class PlayerContainer extends StatefulWidget {
  const PlayerContainer({super.key});

  @override
  createState() => _PlayerContainerState();
}


class _PlayerContainerState extends State<PlayerContainer> {
  bool _favorite = false;
  double _time = 0;
  bool _paused = false;

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: EdgeInsets.all(24.0),
      child: Column(
        mainAxisSize: MainAxisSize.max,
        spacing: 12.0,
        children: [
          Row(
            mainAxisSize: MainAxisSize.max,
            spacing: 12.0,
            children: [
              IconButton(
                onPressed: () {  },
                icon: Icon(Icons.keyboard_arrow_down_rounded),
                style: IconButton.styleFrom(
                  foregroundColor: Theme.of(context).colorScheme.onPrimaryContainer,
                  iconSize: 24.0,
                ),
              ),
              Spacer(),
              IconButton(
                onPressed: () {  },
                icon: Icon(Icons.bar_chart_rounded),
                style: IconButton.styleFrom(
                  foregroundColor: Theme.of(context).colorScheme.onPrimaryContainer,
                  iconSize: 24.0,
                ),
              ),
              IconButton(
                onPressed: () {  },
                icon: Icon(Icons.cast_rounded),
                style: IconButton.styleFrom(
                  foregroundColor: Theme.of(context).colorScheme.onPrimaryContainer,
                  iconSize: 24.0,
                ),
              ),
            ],
          ),

          Expanded(
            child: Center(
              child: LayoutBuilder(builder: (BuildContext context, BoxConstraints boxConstraints) {
                return Container(
                  width: min(boxConstraints.maxWidth, boxConstraints.maxHeight),
                  height: min(boxConstraints.maxWidth, boxConstraints.maxHeight),
                  decoration: BoxDecoration(
                    color: Theme.of(context).colorScheme.onPrimaryContainer,
                    borderRadius: BorderRadius.all(Radius.circular(12.0)),
                    boxShadow: [
                      BoxShadow(
                          color: Theme.of(context).colorScheme.shadow.withAlpha(31),
                          spreadRadius: 10.0,
                          blurRadius: 15.0
                      ),
                    ],
                  ),
                );
              }),
            ),
          ),

          Row(
            mainAxisSize: MainAxisSize.max,
            spacing: 12.0,
            children: [
              Expanded(
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    Text(
                      "Song Title",
                      style: TextStyle(
                        color: Theme.of(context).colorScheme.onPrimaryContainer,
                        fontWeight: FontWeight.bold,
                        overflow: TextOverflow.ellipsis,
                      ),
                      textScaler: TextScaler.linear(2.0),
                    ),
                    Text(
                      "Artist",
                      style: TextStyle(
                        color: Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(127),
                        overflow: TextOverflow.ellipsis,
                      ),
                      textScaler: TextScaler.linear(1.25),
                    ),
                  ],
                ),
              ),
              IconButton(
                onPressed: () => setState(() {
                  _favorite = !_favorite;
                }),
                icon: Icon(Icons.favorite_border_rounded),
                selectedIcon: Icon(Icons.favorite_rounded),
                isSelected: _favorite,
                style: IconButton.styleFrom(
                  backgroundColor: Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(63),
                  foregroundColor: Theme.of(context).colorScheme.onPrimaryContainer,
                  iconSize: 24.0,
                  padding: EdgeInsets.all(12.0),
                ),
              ),
              IconButton(
                onPressed: () {  },
                icon: Icon(Icons.more_vert_rounded),
                style: IconButton.styleFrom(
                  backgroundColor: Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(63),
                  foregroundColor: Theme.of(context).colorScheme.onPrimaryContainer,
                  iconSize: 24.0,
                  padding: EdgeInsets.all(12.0),
                ),
              ),
            ],
          ),

          SliderTheme(
            data: SliderTheme.of(context).copyWith(
              valueIndicatorColor: Theme.of(context).colorScheme.onPrimaryContainer,
              valueIndicatorTextStyle: TextStyle(color: Theme.of(context).colorScheme.primaryContainer),
            ),
            child: Slider(
              value: _time,
              label: "${(_time / 60).toInt()}:${(_time % 60).toInt() < 10 ? "0${(_time % 60).toInt()}" : (_time % 60).toInt()}",
              onChanged: (double value) => setState(() { _time = value; }),
              onChangeStart: (double value) {  },
              onChangeEnd: (double value) {  },
              min: 0.0,
              max: 204.0,
              padding: EdgeInsets.zero,
              activeColor: Theme.of(context).colorScheme.onPrimaryContainer,
              inactiveColor: Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(363),
            ),
          ),
          Row(
            mainAxisSize: MainAxisSize.max,
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            children: [
              Text(
                "1:36",
                style: TextStyle(
                  color: Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(127),
                ),
                textScaler: TextScaler.linear(0.8),
              ),
              Container(
                decoration: BoxDecoration(
                  color: Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(63),
                  borderRadius: BorderRadius.all(Radius.circular(8.0)),
                ),
                child: Padding(
                  padding: EdgeInsets.fromLTRB(8.0, 4.0, 8.0, 4.0),
                  child: Text(
                    "AAC",
                    style: TextStyle(
                      color: Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(127),
                    ),
                    textScaler: TextScaler.linear(0.6),
                  ),
                ),
              ),
              Text(
                "3:24",
                style: TextStyle(
                  color: Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(127),
                ),
                textScaler: TextScaler.linear(0.8),
              ),
            ],
          ),

          SizedBox(height: 32.0),
          Row(
            mainAxisSize: MainAxisSize.max,
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            spacing: 12.0,
            children: [
              IconButton(
                onPressed: () {  },
                icon: Icon(Icons.shuffle_rounded),
                style: IconButton.styleFrom(
                  foregroundColor: Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(127),
                  iconSize: 32.0,
                ),
              ),
              IconButton(
                onPressed: () {  },
                icon: Icon(Icons.skip_previous_rounded),
                style: IconButton.styleFrom(
                  foregroundColor: Theme.of(context).colorScheme.onPrimaryContainer,
                  iconSize: 48.0,
                ),
              ),
              IconButton(
                onPressed: () => setState(() {
                  _paused = !_paused;
                }),
                icon: Icon(Icons.pause_rounded),
                selectedIcon: Icon(Icons.play_arrow_rounded),
                isSelected: _paused,
                style: IconButton.styleFrom(
                  backgroundColor: Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(63),
                  foregroundColor: Theme.of(context).colorScheme.onPrimaryContainer,
                  iconSize: 48.0,
                  padding: EdgeInsets.all(12.0),
                ),
              ),
              IconButton(
                onPressed: () {  },
                icon: Icon(Icons.skip_next_rounded),
                style: IconButton.styleFrom(
                  foregroundColor: Theme.of(context).colorScheme.onPrimaryContainer,
                  iconSize: 48.0,
                ),
              ),
              IconButton(
                onPressed: () {  },
                icon: Icon(Icons.repeat_rounded),
                style: IconButton.styleFrom(
                  foregroundColor: Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(127),
                  iconSize: 32.0,
                ),
              ),
            ],
          ),
          SizedBox(height: 32.0),

          Row(
            mainAxisSize: MainAxisSize.max,
            mainAxisAlignment: MainAxisAlignment.spaceAround,
            children: [
              IconButton(
                onPressed: () {  },
                icon: Icon(Icons.subtitles_rounded),
                style: IconButton.styleFrom(
                  foregroundColor: Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(127),
                  iconSize: 24.0,
                ),
              ),
              IconButton(
                onPressed: () {  },
                icon: Icon(Icons.auto_awesome_rounded),
                style: IconButton.styleFrom(
                  foregroundColor: Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(127),
                  iconSize: 24.0,
                ),
              ),
              IconButton(
                onPressed: () {  },
                icon: Icon(Icons.list_rounded),
                style: IconButton.styleFrom(
                  foregroundColor: Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(127),
                  iconSize: 24.0,
                ),
              ),
            ],
          ),
        ],
      ),
    );
  }
}
