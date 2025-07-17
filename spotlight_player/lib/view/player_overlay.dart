import 'dart:math';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '/player_viewmodel.dart';
import '/view/theme.dart' as theme;


class EffectPainter extends CustomPainter {
  final debug = false;
  final _safeArea = -20.0;

  final Size sliderThumbSize;
  final Offset sliderThumbCenter;
  final Offset albumCoverCenter;

  const EffectPainter({
    required this.sliderThumbSize,
    required this.sliderThumbCenter,
    required this.albumCoverCenter,
  });

  @override
  void paint(Canvas canvas, Size size) {
    final (X, Y) = (size.width, size.height);
    final (x, y) = (sliderThumbCenter.dx, sliderThumbCenter.dy);
    final (a, b) = (albumCoverCenter.dx, albumCoverCenter.dy);

    final septa = a == b ? pi / 2 : atan((y - b) / (a - x));
    final (lSepta, rSepta) = (septa + pi / 9, septa - pi / 9);

    final (lTargetX, rTargetX) = (x + (y - _safeArea) / tan(lSepta), x + (y - _safeArea) / tan(rSepta));
    final (lTargetY, rTargetY) = (y - ((x - _safeArea) * tan(lSepta)).abs(), y - ((X - x - _safeArea) * tan(rSepta)).abs());

    final shadowPaint = Paint()
      ..color = theme.extendedColors.shadow;
    shadowPaint.maskFilter = MaskFilter.blur(BlurStyle.normal, 5);
    final shadowPath = Path();

    shadowPath.moveTo(x, y);
    if (lTargetX >= _safeArea) {
      shadowPath.lineTo(lTargetX, _safeArea);
      shadowPath.lineTo(_safeArea, _safeArea);
      if (debug) canvas.drawLine(sliderThumbCenter, Offset(lTargetX, _safeArea), Paint()..color = Colors.white);
    } else {
      shadowPath.lineTo(_safeArea, lTargetY);
      if (debug) canvas.drawLine(sliderThumbCenter, Offset(_safeArea, lTargetY), Paint()..color = Colors.white);
    }
    shadowPath.lineTo(_safeArea, Y - _safeArea);
    shadowPath.lineTo(X - _safeArea, Y - _safeArea);

    if (rTargetX <= X - _safeArea) {
      shadowPath.lineTo(X - _safeArea, _safeArea);
      shadowPath.lineTo(rTargetX, _safeArea);
      if (debug) canvas.drawLine(sliderThumbCenter, Offset(rTargetX, _safeArea), Paint()..color = Colors.red);
    } else {
      shadowPath.lineTo(X - _safeArea, rTargetY);
      if (debug) canvas.drawLine(sliderThumbCenter, Offset(X - _safeArea, rTargetY), Paint()..color = Colors.red);
    }
    shadowPath.moveTo(x, y);
    shadowPath.close();

    canvas.drawPath(shadowPath, shadowPaint);

    if (debug) {
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
      || albumCoverCenter != oldDelegate.albumCoverCenter;
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
