import 'dart:async';
import 'package:audioplayers/audioplayers.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';


enum RepeatMode {
  none(Icons.repeat_rounded), repeat(Icons.repeat_rounded), repeatOne(Icons.repeat_one_rounded);
  final IconData iconData;
  const RepeatMode(this.iconData);
}


class PlayerViewModel extends ChangeNotifier {
  final GlobalKey sliderKey = GlobalKey();
  final Size sliderThumbSize = Size(8.0, 44.0);
  final ValueNotifier<double> musicTimeNotifier = ValueNotifier(0.0);
  final ValueNotifier<double> musicLengthNotifier = ValueNotifier(0.1);

  bool _isInit = false;
  bool _isPlayingWhenControlling = false;

  late AudioPlayer _player;
  String _title = "Heroes Tonight";
  String _artist = "Janji, Johnning";
  bool _isControlling = false;
  bool _isFavorite = false;
  bool _isShuffle = false;
  RepeatMode _repeatMode = RepeatMode.none;
  bool _isPlaying = false;

  String get title => _title;
  set title (String value) {
    _title = value;
    notifyListeners();
  }
  String get artist => _artist;
  set artist (String value) {
    _artist = value;
    notifyListeners();
  }
  bool get isControlling => _isControlling;
  bool get isFavorite => _isFavorite;
  bool get isShuffle => _isShuffle;
  RepeatMode get repeatMode => _repeatMode;
  bool get isPlaying => _isPlaying;
  double get musicTime => musicTimeNotifier.value;
  double get musicLength => musicLengthNotifier.value;
  double get musicRate => musicTime / musicLength;

  Future init() async {
    _isInit = true;
    _player = AudioPlayer();
    _player.onDurationChanged.listen((Duration duration) {
      musicLengthNotifier.value = duration.inMilliseconds / 1000;
    });
    _player.onPositionChanged.listen((Duration duration) {
      if (duration.inMilliseconds / 1000 <= musicLengthNotifier.value) {
        musicTimeNotifier.value = duration.inMilliseconds / 1000;
      }
    });
    _player.onPlayerComplete.listen((_) async {
      musicTimeNotifier.value = 0.0; // tq 왜 안돼ㅈ
      if (_repeatMode == RepeatMode.none) {
        await _player.setSource(AssetSource("audios/HeroesTonight.mp3"));
        await _player.pause();
        _isPlaying = false;
        notifyListeners();
      } else {
        _player.resume();
      }
    });
    await _player.setSource(AssetSource("audios/HeroesTonight.mp3"));
    if (kDebugMode) print("Player Inited");
  }

  @override
  void dispose() {
    _player.dispose();
    super.dispose();
  }

  Size? getSliderSize() {
    if (sliderKey.currentContext != null) {
      RenderBox renderBox = sliderKey.currentContext!.findRenderObject() as RenderBox;
      return renderBox.size;
    }
    return null;
  }

  Offset? getSliderPosition() {
    if (sliderKey.currentContext != null) {
      RenderBox renderBox = sliderKey.currentContext!.findRenderObject() as RenderBox;
      return renderBox.localToGlobal(Offset.zero);
    }
    return null;
  }

  Offset? getSliderThumbCenter() {
    if (sliderKey.currentContext != null) {
      RenderBox renderBox = sliderKey.currentContext!.findRenderObject() as RenderBox;
      final position = renderBox.localToGlobal(Offset.zero);
      final size = renderBox.size;
      if (musicRate * size.width < 0.5 * sliderThumbSize.width) {
        return Offset(
            position.dx + sliderThumbSize.width,
            position.dy + 0.5 * size.height
        );
      } else if ((1.0 - musicRate) * size.width < 0.5 * sliderThumbSize.width) {
        return Offset(
            position.dx + size.width - sliderThumbSize.width,
            position.dy + 0.5 * size.height
        );
      } else {
        return Offset(
            position.dx + musicRate * size.width,
            position.dy + 0.5 * size.height
        );
      }
    }
    return null;
  }

  void toggleIsFavorite([bool? isFavorite]) {
    if (isFavorite == null) {
      _isFavorite = !_isFavorite;
    } else {
      _isFavorite = isFavorite;
    }
    notifyListeners();
  }

  void toggleIsShuffle([bool? isShuffle]) {
    if (isShuffle == null) {
      _isShuffle = !_isShuffle;
    } else {
      _isShuffle = isShuffle;
    }
    notifyListeners();
  }

  void toggleRepeatMode([RepeatMode? repeatMode]) {
    if (repeatMode == null) {
      _repeatMode = switch (_repeatMode) {
        RepeatMode.none => RepeatMode.repeat,
        RepeatMode.repeat => RepeatMode.repeatOne,
        RepeatMode.repeatOne => RepeatMode.none
      };
    } else {
      _repeatMode = repeatMode;
    }
    _player.setReleaseMode(
        repeatMode == RepeatMode.none
            ? ReleaseMode.stop
            : ReleaseMode.loop
    );
    notifyListeners();
  }

  void seek(int milliseconds) {
    _player.seek(Duration(milliseconds: milliseconds));
  }

  Future<void> controlStart() async {
    _isControlling = true;
    _isPlayingWhenControlling = _isPlaying;
    if (_isInit) {
      await _player.pause();
    } else {
      await init();
    }
    notifyListeners();
  }

  Future<void> controlEnd() async {
    _isControlling = false;
    if (_isPlayingWhenControlling) await _player.resume();
    notifyListeners();
  }

  Future<void> resume() async {
    if (!_isInit) await init();
    _isPlaying = true;
    await _player.resume();
    notifyListeners();
  }

  Future<void> pause() async {
    _isPlaying = false;
    await _player.pause();
    notifyListeners();
  }

  String formatTime(double time) {
    return "${(time / 60).floor()}:${(time % 60).floor() < 10 ? "0${(time % 60).floor()}" : (time % 60).floor()}";
  }
}
