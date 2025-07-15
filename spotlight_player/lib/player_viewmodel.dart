import 'dart:async';
import 'package:flutter/material.dart';


class PlayerViewModel extends ChangeNotifier {
  final Key sliderKey = GlobalKey();
  final ValueNotifier<double> musicTimeNotifier = ValueNotifier(0.0);
  final ValueNotifier<double> musicLengthNotifier = ValueNotifier(204.0);

  bool _isPlaying = false;
  bool _isFavorite = false;
  bool _isShuffle = false;
  int _isRepeat = -1;

  bool get isPlaying => _isPlaying;
  set isPlaying (bool value) {
    _isPlaying = value;
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
    notifyListeners();
  }
  double get musicTime => musicTimeNotifier.value;
  double get musicLength => musicLengthNotifier.value;
  double get musicRate => musicTime / musicLength;

  PlayerViewModel() {
    Timer.periodic(const Duration(milliseconds: 50), (timer) {
      if (_isPlaying && musicTime + 0.05 <= musicLength) {
        musicTimeNotifier.value += 0.05;
      } else if (_isPlaying && musicTime + 0.05 >= musicLength) {
        musicTimeNotifier.value = 0.0;
        _isPlaying = false;
        notifyListeners();
      }
    });
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