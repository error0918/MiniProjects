import 'dart:math';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '/player_viewmodel.dart';
import '/view/theme.dart' as theme;


class EffectPainter extends CustomPainter {
  final _safeArea = -20.0;
  final _scatterRadian = pi / 7;

  final Size sliderThumbSize;
  final Offset sliderThumbCenter;
  final Offset albumCoverCenter;
  final bool isDebug;

  const EffectPainter({
    required this.sliderThumbSize,
    required this.sliderThumbCenter,
    required this.albumCoverCenter,
    this.isDebug = false,
  });

  @override
  void paint(Canvas canvas, Size size) {
    final (X, Y) = (size.width, size.height);
    final (w, h) = (sliderThumbSize.width, sliderThumbSize.height);
    final (x, y) = (sliderThumbCenter.dx, sliderThumbCenter.dy);
    final (a, b) = (albumCoverCenter.dx, albumCoverCenter.dy);

    final septaRaw = a == b ? pi / 2 : atan2(y - b, a - x);
    final septa = septaRaw >= 0 ? septaRaw : (septaRaw + 2 * pi);
    final (lSepta, rSepta) = (septa + _scatterRadian, septa - _scatterRadian);

    // CenterLine ↓

    if (isDebug) {
      final targetX = x + (y - _safeArea) / tan(septa);
      final targetY = y - ((x - _safeArea) * tan(septa)).abs();

      if (targetX >= _safeArea && targetX <= X - _safeArea) {
        canvas.drawLine(
          sliderThumbCenter,
          Offset(targetX, _safeArea),
          Paint()
            ..color = Colors.grey,
        );
      } else {
        canvas.drawLine(
          sliderThumbCenter,
          Offset(_safeArea, targetY),
          Paint()
            ..color = Colors.grey,
        );
      }
    }

    // CenterLine ↑
    // SidePower ↓

    final sidePowerPaint = Paint()
      ..color = theme.extendedColors.powerLight
      ..maskFilter = MaskFilter.blur(BlurStyle.normal, 16);

    final (llpSepta, lrpSepta) = (lSepta + pi / 60, lSepta - pi / 60);
    final (llpTargetX, lrpTargetX) = (x + (y - _safeArea) / tan(llpSepta), x + (y - _safeArea) / tan(lrpSepta));
    final (llpTargetY, lrpTargetY) = (y - ((x - _safeArea) * tan(llpSepta)).abs(), y - ((x - _safeArea) * tan(lrpSepta)).abs());

    final leftSidePowerPath = Path();

    leftSidePowerPath.moveTo(x, y);
    if (llpTargetX >= _safeArea) {
      leftSidePowerPath.lineTo(llpTargetX, _safeArea);
    } else {
      leftSidePowerPath.lineTo(_safeArea, llpTargetY);
      leftSidePowerPath.lineTo(_safeArea, _safeArea);
    }

    if (lrpTargetX >= _safeArea) {
      leftSidePowerPath.lineTo(lrpTargetX, _safeArea);
    } else {
      leftSidePowerPath.lineTo(_safeArea, lrpTargetY);
    }
    leftSidePowerPath.lineTo(x, y);
    leftSidePowerPath.close();

    canvas.drawPath(leftSidePowerPath, sidePowerPaint);
    if (isDebug) {
      canvas.drawPath(
        leftSidePowerPath,
        Paint()
          ..color = Colors.red
          ..style = PaintingStyle.stroke,
      );
    }

    final (rlpSepta, rrpSepta) = (rSepta + pi / 60, rSepta - pi / 60);
    final (rlpTargetX, rrpTargetX) = (x + (y - _safeArea) / tan(rlpSepta), x + (y - _safeArea) / tan(rrpSepta));
    final (rlpTargetY, rrpTargetY) = (y - ((X - x - _safeArea) * tan(rlpSepta)).abs(), y - ((X - x - _safeArea) * tan(rrpSepta)).abs());

    final rightSidePowerPath = Path();

    rightSidePowerPath.moveTo(x, y);
    if (rlpTargetX <= X - _safeArea) {
      rightSidePowerPath.lineTo(rlpTargetX, _safeArea);
      rightSidePowerPath.lineTo(X - _safeArea, _safeArea);
    } else {
      rightSidePowerPath.lineTo(X - _safeArea, rlpTargetY);
    }

    if (rrpTargetX <= X - _safeArea) {
      rightSidePowerPath.lineTo(rrpTargetX, _safeArea);
    } else {
      rightSidePowerPath.lineTo(X - _safeArea, rrpTargetY);
    }
    rightSidePowerPath.lineTo(x, y);
    rightSidePowerPath.close();

    canvas.drawPath(rightSidePowerPath, sidePowerPaint);
    if (isDebug) {
      canvas.drawPath(
        rightSidePowerPath,
        Paint()
          ..color = Colors.red
          ..style = PaintingStyle.stroke,
      );
    }

    // SidePower ↑
    // RadiusPower ↓

    final rpRadius = 80.0;
    final (rplTargetX, rprTargetX) = (x + rpRadius * cos(lSepta), x + rpRadius * cos(rSepta));
    final (rplTargetY, rprTargetY) = (y - (rpRadius * sin(lSepta)).abs(), y - (rpRadius * sin(rSepta)).abs());

    final radiusPowerPaint = Paint()
      ..color = theme.extendedColors.powerLight
      ..maskFilter = MaskFilter.blur(BlurStyle.normal, 16);
    final radiusPowerPowerPath = Path();

    radiusPowerPowerPath.moveTo(x, y);
    radiusPowerPowerPath.lineTo(rplTargetX, rplTargetY);
    radiusPowerPowerPath.arcToPoint(
      Offset(rprTargetX, rprTargetY),
      radius: Radius.circular(40.0),
    );
    radiusPowerPowerPath.lineTo(x, y);
    radiusPowerPowerPath.close();

    canvas.drawPath(radiusPowerPowerPath, radiusPowerPaint);
    if (isDebug) {
      canvas.drawPath(
          radiusPowerPowerPath,
          Paint()
            ..color = Colors.deepOrange
            ..style = PaintingStyle.stroke
      );
    }

    // RadiusPower ↑
    // Shadow ↓

    final (lTargetX, rTargetX) = (x + (y - _safeArea) / tan(lSepta), x + (y - _safeArea) / tan(rSepta));
    final (lTargetY, rTargetY) = (y - ((x - _safeArea) * tan(lSepta)).abs(), y - ((X - x - _safeArea) * tan(rSepta)).abs());

    final shadowPaint = Paint()
      ..color = theme.extendedColors.shadow
      ..maskFilter = MaskFilter.blur(BlurStyle.normal, 5);
    final shadowPath = Path();

    shadowPath.moveTo(x, y);
    if (lTargetX >= _safeArea) {
      shadowPath.lineTo(lTargetX, _safeArea);
      shadowPath.lineTo(_safeArea, _safeArea);
    } else {
      shadowPath.lineTo(_safeArea, lTargetY);
    }
    shadowPath.lineTo(_safeArea, Y - _safeArea);
    shadowPath.lineTo(X - _safeArea, Y - _safeArea);

    if (rTargetX <= X - _safeArea) {
      shadowPath.lineTo(X - _safeArea, _safeArea);
      shadowPath.lineTo(rTargetX, _safeArea);
    } else {
      shadowPath.lineTo(X - _safeArea, rTargetY);
    }
    shadowPath.lineTo(x, y);
    shadowPath.close();

    canvas.drawPath(shadowPath, shadowPaint);
    if (isDebug) {
      canvas.drawPath(
          shadowPath,
          Paint()
            ..color = Colors.white
            ..style = PaintingStyle.stroke
      );
    }

    // Shadow ↑
    // CenterForwardPower ↓

    final centerForwardPowerWidth = 32.0;
    final centerForwardPowerHeight = 128.0;
    final centerForwardPowerLen = sqrt(
        centerForwardPowerWidth * centerForwardPowerWidth
            + centerForwardPowerHeight * centerForwardPowerHeight
    ) / 2.0;
    final (cfpX, cfpY) = (x + centerForwardPowerLen * cos(septa), y - centerForwardPowerLen * sin(septa));

    final centerForwardPowerPaint = Paint()
      ..color = theme.extendedColors.powerLight
      ..maskFilter = MaskFilter.blur(BlurStyle.normal, 8);
    final centerForwardPowerPath = Path();

    centerForwardPowerPath.addOval(
      Rect.fromCenter(
        center: Offset(cfpX, cfpY),
        width: centerForwardPowerWidth,
        height: centerForwardPowerHeight,
      ),
    );

    final matrix4centerForwardPower = Matrix4.identity()
      ..translate(cfpX, cfpY)
      ..rotateZ(-septa - pi / 2)
      ..translate(-cfpX, -cfpY);

    canvas.drawPath(centerForwardPowerPath.transform(matrix4centerForwardPower.storage), centerForwardPowerPaint);
    if (isDebug) {
      canvas.drawPath(
          centerForwardPowerPath.transform(matrix4centerForwardPower.storage),
          Paint()
            ..color = Colors.amber
            ..style = PaintingStyle.stroke
      );
    }

    // CenterForwardPower ↑
    // CenterForward ↓

    final centerForwardWidth = 24.0;
    final centerForwardHeight = 96.0;
    final centerForwardLen = sqrt(
        centerForwardWidth * centerForwardWidth
            + centerForwardHeight * centerForwardHeight
    ) / 2.0;
    final (cfX, cfY) = (x + centerForwardLen * cos(septa), y - centerForwardLen * sin(septa));
    final centerForwardPaint = Paint()
      ..color = theme.extendedColors.light
      ..maskFilter = MaskFilter.blur(BlurStyle.normal, 8);
    final centerForwardPath = Path();

    centerForwardPath.addOval(
      Rect.fromCenter(
        center: Offset(cfX, cfY),
        width: centerForwardWidth,
        height: centerForwardHeight,
      ),
    );

    final matrix4centerForward = Matrix4.identity()
      ..translate(cfX, cfY)
      ..rotateZ(-septa - pi / 2)
      ..translate(-cfX, -cfY);

    canvas.drawPath(centerForwardPath.transform(matrix4centerForward.storage), centerForwardPaint);
    if (isDebug) {
      canvas.drawPath(
          centerForwardPath.transform(matrix4centerForward.storage),
          Paint()
            ..color = Colors.amberAccent
            ..style = PaintingStyle.stroke
      );
    }

    // CenterForward ↑
    // CenterLight ↓

    final centerRadius = 12.0;
    final centerPaint = Paint()
      ..color = theme.extendedColors.light
      ..maskFilter = MaskFilter.blur(BlurStyle.normal, 6);
    final centerLightPath = Path();

    centerLightPath.moveTo(x - w / 2 - centerRadius, y - h / 2);
    centerLightPath.arcToPoint(
      Offset(x + w / 2 + centerRadius, y - h / 2),
      radius: Radius.circular(centerRadius),
    );
    centerLightPath.lineTo(x + w / 2 + centerRadius, y + h / 2);
    centerLightPath.arcToPoint(
      Offset(x - w / 2 - centerRadius, y + h / 2),
      radius: Radius.circular(centerRadius),
    );
    centerLightPath.lineTo(x - w / 2 - centerRadius, y + h / 2);
    centerLightPath.close();

    canvas.drawPath(centerLightPath, centerPaint);
    if (isDebug) {
      canvas.drawPath(
          centerLightPath,
          Paint()
            ..color = Colors.brown
            ..style = PaintingStyle.stroke
      );
    }

    // CenterLight ↑

    if (isDebug) {
      final safePaint = Paint()
        ..color = Colors.blue
        ..style = PaintingStyle.stroke;
      final safePath = Path();
      safePath.moveTo(_safeArea, _safeArea);
      safePath.lineTo(_safeArea, Y - _safeArea);
      safePath.lineTo(X - _safeArea, Y - _safeArea);
      safePath.lineTo(X - _safeArea, _safeArea);
      safePath.lineTo(_safeArea, _safeArea);
      canvas.drawPath(safePath, safePaint);
    }
  }

  @override
  bool shouldRepaint(EffectPainter oldDelegate) {
    return sliderThumbSize != oldDelegate.sliderThumbSize
      || sliderThumbCenter != oldDelegate.sliderThumbCenter
      || albumCoverCenter != oldDelegate.albumCoverCenter
      || isDebug != oldDelegate.isDebug;
  }
}


class PlayerOverlay extends StatelessWidget {
  const PlayerOverlay({super.key});

  @override
  Widget build(BuildContext context) {
    final PlayerViewModel playerViewModel = Provider.of<PlayerViewModel>(context, listen: false);

    return ListenableBuilder(
      listenable: Listenable.merge([playerViewModel.musicTimeNotifier, playerViewModel.musicLengthNotifier]),
      builder: (BuildContext context, Widget? child) {
        return LayoutBuilder(
          builder: (BuildContext context, BoxConstraints boxConstraints) {
            if (!WidgetsBinding.instance.firstFrameRasterized) return Container();

            final sliderThumbSize = playerViewModel.sliderThumbSize;
            final sliderThumbCenter = playerViewModel.getSliderThumbCenter();
            final albumCoverCenter = playerViewModel.getAlbumCoverCenter();

            if (sliderThumbCenter == null || albumCoverCenter == null) {
              return Container();
            } else {
              return CustomPaint(
                painter: EffectPainter(
                  sliderThumbSize: sliderThumbSize,
                  sliderThumbCenter: sliderThumbCenter,
                  albumCoverCenter: albumCoverCenter,
                  isDebug: playerViewModel.isDebug,
                ),
                size: Size(boxConstraints.maxWidth, boxConstraints.maxHeight),
              );
            }
          },
        );
      },
    );
  }
}
