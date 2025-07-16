import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '/player_viewmodel.dart';

class PlayerOverlay extends StatelessWidget {
  const PlayerOverlay({super.key});

  @override
  Widget build(BuildContext context) {
    final PlayerViewModel playerViewModel = Provider.of<PlayerViewModel>(context, listen: false);

    return ListenableBuilder(
      listenable: Listenable.merge(
        [playerViewModel.musicTimeNotifier, playerViewModel.musicLengthNotifier],
      ),
      builder: (BuildContext context, Widget? child) {
        final sliderThumbSize = playerViewModel.sliderThumbSize;
        final sliderThumbCenter = playerViewModel.getSliderThumbCenter();

        if (sliderThumbCenter == null) {
          return Container();
        } else {
          return Stack(
            children: [
              Container(
                color: Colors.black.withAlpha(31),
              ),
              Positioned(
                top: sliderThumbCenter.dy - 0.5 * sliderThumbSize.height - 8.0,
                left: sliderThumbCenter.dx - 0.5 * sliderThumbSize.width - 8.0,
                child: Container(
                    width: sliderThumbSize.width + 16.0,
                    height: sliderThumbSize.height + 16.0,
                    decoration: BoxDecoration(
                      borderRadius: BorderRadius.all(Radius.circular(4.0)),
                      color: Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(127),
                    ),
                ),
              ),
            ],
          );
        }
      },
    );
  }
}
