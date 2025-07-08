import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '/model/game.dart';
import '/viewmodel/game_view_model.dart';


class ControllerWidget extends StatefulWidget {
  final double size;

  const ControllerWidget({super.key, this.size = 0.0});

  @override
  createState() => _ControllerWidgetState();
}


class _ControllerWidgetState extends State<ControllerWidget> {
  @override
  Widget build(BuildContext context) {
    final iconSize = 28.0 * (0.75 + widget.size / 600.0);
    return Expanded(
        child: Container(
          decoration: BoxDecoration(
            color: Theme.of(context).colorScheme.surfaceContainer,
            borderRadius: BorderRadius.circular(12.0),
          ),
          child: Consumer<GameViewModel>(builder: (context, provider, child) {
            return Stack(
              alignment: Alignment.center,
              children: [
                Positioned(
                  top: 12.0,
                  right: 12.0,
                  child: ControlButton(
                    onPressed: !provider.able ? null : () => provider.autoProcess(),
                    icon: Icons.play_arrow,
                    iconSize: iconSize,
                    radiusTopLeft: 12,
                    radiusTopRight: 12,
                    radiusBottomLeft: 12,
                    radiusBottomRight: 12,
                  ),
                ),
                Column(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    Transform.translate(
                      offset: Offset(0, 0.5),
                      child: ControlButton(
                        onPressed: !provider.ableCol ? null : () => provider.process(Direction.up),
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
                            onPressed: !provider.ableRow ? null : () => provider.process(Direction.left),
                            icon: Icons.arrow_left,
                            iconSize: iconSize,
                            radiusTopLeft: 12,
                            radiusBottomLeft: 12,
                          ),
                        ),
                        ControlButton(
                          onPressed: !provider.free ? null : () => provider.add(),
                          icon: Icons.circle,
                          iconSize: iconSize * 0.75,
                          paddingSize: iconSize * 11.0 / 24.0,
                        ),
                        Transform.translate(
                          offset: Offset(-0.5, 0),
                          child: ControlButton(
                            onPressed: !provider.ableRow ? null : () => provider.process(Direction.right),
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
                        onPressed: !provider.ableCol ? null : () => provider.process(Direction.down),
                        icon: Icons.arrow_drop_down,
                        iconSize: iconSize,
                        radiusBottomLeft: 12,
                        radiusBottomRight: 12,
                      ),
                    ),
                  ],
                ),
                Positioned(
                    bottom: 12.0,
                    child: Text(
                      "Max: ${provider.max}, Score: ${provider.score}",
                      maxLines: 1,
                      style: TextStyle(
                        color: Theme.of(context).colorScheme.onSurfaceVariant.withAlpha(127),
                      ),
                    )
                ),
              ],
            );
          })
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
