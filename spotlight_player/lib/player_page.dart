import 'dart:math';
import 'dart:ui';
import 'package:flutter/material.dart';


class PlayerPage extends StatefulWidget {
  const PlayerPage({super.key});

  @override
  State<PlayerPage> createState() => _PlayerPageState();
}


class _PlayerPageState extends State<PlayerPage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: LayoutBuilder(
        builder: (BuildContext context, BoxConstraints boxConstraints) {
          return BackgroundContainer(
            width: boxConstraints.maxWidth,
            height: boxConstraints.maxHeight,
          );
        },
      ),
    );
  }
}


class BackgroundContainer extends StatefulWidget {
  const BackgroundContainer({super.key, required this.width, required this.height});
  
  final double width;
  final double height;
  double get size => width < height ? (width + 2 * height) / 3 : (2 * width + height) / 3;

  @override
  State<BackgroundContainer> createState() => _BackgroundContainerState();
}


class _BackgroundContainerState extends State<BackgroundContainer> with TickerProviderStateMixin {
  final _random = Random();
  final int _moveDuration = 12000;
  final int _sizeDuration = 18000;
  final int _durationBase = 2000;

  late Animation<double> _animationX1, _animationY1, _animationSize1;
  late AnimationController _controllerX1, _controllerY1, _controllerSize1;
  late double _minSize1, _maxSize1;
  late Animation<double> _animationX2, _animationY2, _animationSize2;
  late AnimationController _controllerX2, _controllerY2, _controllerSize2;
  late double _minSize2, _maxSize2;
  late Animation<double> _animationX3, _animationY3, _animationSize3;
  late AnimationController _controllerX3, _controllerY3, _controllerSize3;
  late double _minSize3, _maxSize3;

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

  Animation<double> _makeSizeAnimation({
    required AnimationController controller,
    required void Function(Animation<double>) setAnimation,
    required double Function() getMinSize,
    required void Function(double) setMinSize,
    required double Function() getMaxSize,
    required void Function(double) setMaxSize,
  }) {
    return Tween(begin: getMinSize(), end: getMaxSize())
        .animate(controller)
      ..addListener(() {
        if (controller.isCompleted) {
          controller.duration = Duration(milliseconds: _random.nextInt(_sizeDuration) + _durationBase);
          setMinSize(widget.size * 1 / 4 + _random.nextDouble() * widget.size / 4);
          setAnimation(Tween(begin: getMinSize(), end: getMaxSize()).animate(controller));
          controller.reverse();
        } else if (controller.isDismissed) {
          controller.duration = Duration(milliseconds: _random.nextInt(_sizeDuration) + _durationBase);
          setMaxSize(widget.size * 2 / 4 + _random.nextDouble() * widget.size / 4);
          setAnimation(Tween(begin: getMinSize(), end: getMaxSize()).animate(controller));
          controller.forward();
        }
      });
  }

  @override
  void initState() {
    super.initState();

    final minSize = widget.size * 1 / 4 + _random.nextDouble() * widget.size / 4;
    final maxSize = widget.size * 2 / 4 + _random.nextDouble() * widget.size / 4;
    _minSize1 = _minSize2 = _minSize3 = minSize;
    _maxSize1 = _maxSize2 = _maxSize3 = maxSize;

    _controllerX1 = _makeController(_moveDuration);
    _animationX1 = _makeMoveAnimation(_controllerX1);
    _controllerY1 = _makeController(_moveDuration);
    _animationY1 = _makeMoveAnimation(_controllerY1);
    _controllerSize1 = _makeController(_sizeDuration);
    _animationSize1 = _makeSizeAnimation(
      controller: _controllerSize1,
      setAnimation: (animation) { _animationSize1 = animation; },
      getMinSize: () => _minSize1,
      setMinSize: (minSize) { _minSize1 = minSize; },
      getMaxSize: () => _maxSize1,
      setMaxSize: (maxSize) { _maxSize1 = maxSize; },
    );

    _controllerX2 = _makeController(_moveDuration);
    _animationX2 = _makeMoveAnimation(_controllerX2);
    _controllerY2 = _makeController(_moveDuration);
    _animationY2 = _makeMoveAnimation(_controllerY2);
    _controllerSize2 = _makeController(_sizeDuration);
    _animationSize2 = _makeSizeAnimation(
      controller: _controllerSize2,
      setAnimation: (animation) { _animationSize2 = animation; },
      getMinSize: () => _minSize2,
      setMinSize: (minSize) { _minSize2 = minSize; },
      getMaxSize: () => _maxSize2,
      setMaxSize: (maxSize) { _maxSize2 = maxSize; },
    );

    _controllerX3 = _makeController(_moveDuration);
    _animationX3 = _makeMoveAnimation(_controllerX3);
    _controllerY3 = _makeController(_moveDuration);
    _animationY3 = _makeMoveAnimation(_controllerY3);
    _controllerSize3 = _makeController(_sizeDuration);
    _animationSize3 = _makeSizeAnimation(
      controller: _controllerSize3,
      setAnimation: (animation) { _animationSize3 = animation; },
      getMinSize: () => _minSize3,
      setMinSize: (minSize) { _minSize3 = minSize; },
      getMaxSize: () => _maxSize3,
      setMaxSize: (maxSize) { _maxSize3 = maxSize; },
    );

    _controllerX1.forward();
    _controllerY1.forward();
    _controllerSize1.reverse(from: 1.0);

    _controllerX2.forward();
    _controllerY2.reverse(from: 1.0);
    _controllerSize2.forward();

    _controllerX3.reverse(from: 1.0);
    _controllerY3.forward();
    _controllerSize3.reverse(from: 1.0);
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
        ...List.generate(3, (i) {
          return
            Positioned.fill(
              child: BackdropFilter(
                filter: ImageFilter.blur(
                  sigmaX: widget.size / 5,
                  sigmaY: widget.size / 5,
                ),
                child: Container(color: Colors.transparent),
              ),
            );
        }),
        Positioned.fill(
          child: Container(color: Colors.black.withAlpha(31)),
        ),
        AnimatedBuilder(
          animation: Listenable.merge([
            _controllerX1,
            _controllerY1,
            _controllerSize1,
          ]),
          builder: (context, child) {
            return Positioned(
              left: widget.width * _animationX1.value - _animationSize3.value * 2 / 3,
              top: widget.height * _animationY1.value - _animationSize3.value * 2 / 3,
              child: Container(
                width: _animationSize1.value,
                height: _animationSize1.value,
                decoration: BoxDecoration(
                  color: Theme.of(context).colorScheme.primary.withAlpha(127),
                  shape: BoxShape.circle,
                ),
              ),
            );
          },
        ),
        AnimatedBuilder(
          animation: Listenable.merge([
            _controllerX2,
            _controllerY2,
            _controllerSize2,
          ]),
          builder: (context, child) {
            return Positioned(
              left: widget.width * _animationX2.value - _animationSize2.value * 2 / 3,
              top: widget.height * _animationY2.value - _animationSize2.value * 2 / 3,
              child: Container(
                width: _animationSize2.value,
                height: _animationSize2.value,
                decoration: BoxDecoration(
                  color: Theme.of(context).colorScheme.secondary.withAlpha(127),
                  shape: BoxShape.circle,
                ),
              ),
            );
          },
        ),
        AnimatedBuilder(
          animation: Listenable.merge([
            _controllerX3,
            _controllerY3,
            _controllerSize3,
          ]),
          builder: (context, child) {
            return Positioned(
              left: widget.width * _animationX3.value - _animationSize3.value * 2 / 3,
              top: widget.height * _animationY3.value - _animationSize3.value * 2 / 3,
              child: Container(
                width: _animationSize3.value,
                height: _animationSize3.value,
                decoration: BoxDecoration(
                  color: Theme.of(context).colorScheme.tertiary.withAlpha(127),
                  shape: BoxShape.circle,
                ),
              ),
            );
          },
        ),
        Positioned.fill(
          child: Container(color: Theme.of(context).colorScheme.primaryContainer),
        ),
      ].reversed.toList(),
    );
  }
}
