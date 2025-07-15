import 'dart:async';
import 'package:audioplayers/audioplayers.dart';
import 'package:flutter/material.dart';


class PlayerViewModel extends ChangeNotifier {
  final Key sliderKey = GlobalKey();
  final ValueNotifier<double> musicTimeNotifier = ValueNotifier(0.0);
  final ValueNotifier<double> musicLengthNotifier = ValueNotifier(0.0);

  final _player = AudioPlayer();
  String _title = "Heroes Tonight";
  String _artist = "Janji, Johnning";
  bool _isPlaying = false;
  bool _isFavorite = false;
  bool _isShuffle = false;
  int _isRepeat = -1;
  bool _isPlayingWhenControlling = false;
  bool _isControlling = false;

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
  bool get isPlaying => _isPlaying;
  set isPlaying (bool value) {
    _isPlaying = value;
    if (_isPlaying) {
      _player.resume();
    } else {
      _player.pause();
    }
    notifyListeners();
  }
  bool get isFavorite => _isFavorite;
  set isFavorite (bool value) {
    _isFavorite = value;
    notifyListeners();
  }
  bool get isShuffle => _isShuffle;
  set isShuffle (bool value) {
    _isShuffle = value;
    notifyListeners();
  }
  int get isRepeat => _isRepeat;
  set isRepeat (int value) {
    _isRepeat = switch (value) {
      < -1 => 1,
      > 1 => -1,
      _ => value
    };
    _player.setReleaseMode(_isRepeat == -1 ? ReleaseMode.stop : ReleaseMode.loop);
    notifyListeners();
  }
  bool get isControlling => _isControlling;
  set isControlling (bool value) {
    _isControlling = value;
    if (_isControlling) {
      _isPlayingWhenControlling = _isPlaying;
      _player.pause();
    } else if (_isPlayingWhenControlling) {
      _player.resume();
    }
    notifyListeners();
  }
  double get musicTime => musicTimeNotifier.value;
  double get musicLength => musicLengthNotifier.value;
  double get musicRate => musicTime / musicLength;

  PlayerViewModel() {
    _init();
  }

  Future _init() async {
    await _player.setSource(AssetSource("/audios/HeroesTonight.mp3"));
    _player.onDurationChanged.listen((Duration duration) {
      musicLengthNotifier.value = duration.inMilliseconds / 1000;
    });
    _player.onPositionChanged.listen((Duration duration) {
      if (duration.inMilliseconds / 1000 <= musicLengthNotifier.value) {
        musicTimeNotifier.value = duration.inMilliseconds / 1000;
      }
    });
    _player.onPlayerComplete.listen((_) async {
      if (_isRepeat == -1) {
        await _player.release();
        await _player.setSource(AssetSource("/audios/HeroesTonight.mp3"));
        await _player.seek(Duration.zero);
        _isPlaying = false;
        notifyListeners();
      }
    });
  }

  void seek(int milliseconds) {
    _player.seek(Duration(milliseconds: milliseconds));
  }

  String formatTime(double time) {
    return "${(time / 60).floor()}:${(time % 60).floor() < 10 ? "0${(time % 60).floor()}" : (time % 60).floor()}";
  }

/*
    if (_sliderKey.currentContext != null) {
      RenderBox renderBox = _sliderKey.currentContext!.findRenderObject() as RenderBox;
      print(renderBox.localToGlobal(Offset.zero));
    }
*/
}