import 'dart:math';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '/player_viewmodel.dart';


class PlayerContainer extends StatelessWidget {
  const PlayerContainer({super.key});

  @override
  Widget build(BuildContext context) {
    return Consumer(builder: (BuildContext context, PlayerViewModel playerViewModel, Widget? child) {
      return Padding(
        padding: EdgeInsets.symmetric(vertical: 12.0, horizontal: 24.0),
        child: Column(
          mainAxisSize: MainAxisSize.max,
          spacing: 8.0,
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

            SizedBox(),
            Expanded(
              child: Center(
                child: LayoutBuilder(builder: (BuildContext context, BoxConstraints boxConstraints) {
                  return Container(
                    key: playerViewModel.albumCoverKey,
                    width: min(boxConstraints.maxWidth, boxConstraints.maxHeight),
                    height: min(boxConstraints.maxWidth, boxConstraints.maxHeight),
                    decoration: BoxDecoration(
                      color: Theme.of(context).colorScheme.primaryContainer,
                      image: DecorationImage(
                        fit: BoxFit.fill,
                        image: AssetImage("assets/images/HeroesTonight.jpg"),
                      ),
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
            SizedBox(),

            Row(
              mainAxisSize: MainAxisSize.max,
              spacing: 12.0,
              children: [
                Expanded(
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Text(
                        playerViewModel.title,
                        style: TextStyle(
                          color: Theme.of(context).colorScheme.onPrimaryContainer,
                          fontWeight: FontWeight.bold,
                          overflow: TextOverflow.ellipsis,
                        ),
                        textScaler: TextScaler.linear(1.8),
                      ),
                      Text(
                        playerViewModel.artist,
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
                  onPressed: () => playerViewModel.toggleIsFavorite(),
                  icon: Icon(Icons.favorite_border_rounded),
                  selectedIcon: Icon(Icons.favorite_rounded),
                  isSelected: playerViewModel.isFavorite,
                  style: IconButton.styleFrom(
                    backgroundColor: Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(63),
                    foregroundColor: Theme.of(context).colorScheme.onPrimaryContainer,
                    iconSize: 24.0,
                    padding: EdgeInsets.all(8.0),
                  ),
                ),
                IconButton(
                  onPressed: () {  },
                  icon: Icon(Icons.more_vert_rounded),
                  style: IconButton.styleFrom(
                    backgroundColor: Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(63),
                    foregroundColor: Theme.of(context).colorScheme.onPrimaryContainer,
                    iconSize: 24.0,
                    padding: EdgeInsets.all(8.0),
                  ),
                ),
              ],
            ),

            ListenableBuilder(
              listenable: Listenable.merge(
                  [playerViewModel.musicTimeNotifier, playerViewModel.musicLengthNotifier]
              ),
              builder: (BuildContext context, Widget? child) {
                return Column(
                  spacing: 8.0,
                  children: [
                    SliderTheme(
                      data: SliderTheme.of(context).copyWith(
                        valueIndicatorColor: Theme.of(context).colorScheme.onPrimaryContainer,
                        valueIndicatorTextStyle: TextStyle(color: Theme.of(context).colorScheme.primaryContainer),
                        overlayShape: SliderComponentShape.noOverlay,
                      ),
                      child: Slider(
                        key: playerViewModel.sliderKey,
                        value: playerViewModel.musicTime,
                        onChanged: (double value) => playerViewModel.seeking((value * 1000).floor()),
                        onChangeStart: (double value) async { playerViewModel.controlStart(); },
                        onChangeEnd: (double value) async { playerViewModel.controlEnd(); },
                        min: 0.0,
                        max: playerViewModel.musicLength,
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
                          playerViewModel.formatTime(playerViewModel.musicTime),
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
                              "NCS",
                              style: TextStyle(
                                color: Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(127),
                              ),
                              textScaler: TextScaler.linear(0.6),
                            ),
                          ),
                        ),
                        Text(
                          playerViewModel.formatTime(playerViewModel.musicLength),
                          style: TextStyle(
                            color: Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(127),
                          ),
                          textScaler: TextScaler.linear(0.8),
                        ),
                      ],
                    ),
                  ],
                );
              },
            ),

            SizedBox(height: 24.0),
            Row(
              mainAxisSize: MainAxisSize.max,
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: [
                IconButton(
                  onPressed: () => playerViewModel.toggleIsShuffle(),
                  icon: Icon(Icons.shuffle_rounded),
                  style: IconButton.styleFrom(
                    foregroundColor: playerViewModel.isShuffle
                        ? Theme.of(context).colorScheme.onPrimaryContainer
                        : Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(127),
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
                  onPressed: () async {
                    if (playerViewModel.isPlaying) {
                      playerViewModel.pause();
                    } else {
                      playerViewModel.resume();
                    }
                  },
                  icon: Icon(Icons.play_arrow_rounded),
                  selectedIcon: Icon(Icons.pause_rounded),
                  isSelected: playerViewModel.isPlaying,
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
                  onPressed: () => playerViewModel.toggleRepeatMode(),
                  icon: Icon(playerViewModel.repeatMode.iconData),
                  style: IconButton.styleFrom(
                    foregroundColor: playerViewModel.repeatMode != RepeatMode.none
                        ? Theme.of(context).colorScheme.onPrimaryContainer
                        : Theme.of(context).colorScheme.onPrimaryContainer.withAlpha(127),
                    iconSize: 32.0,
                  ),
                ),
              ],
            ),
            SizedBox(height: 24.0),

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
    });
  }
}
