import 'package:flutter/material.dart';


class PlayerViewModel extends ChangeNotifier {
  final Key sliderKey = GlobalKey();
  bool _isPlaying = false;
  bool _isFavorite = false;
  bool _isShuffle = false;
  int _isRepeat = -1;
  double _musicLength = 204;
  double _musicTime = 0.0;

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
  double get musicLength => _musicLength;
  set musicLength (double value) {
    _musicLength = value;
    notifyListeners();
  }
  double get musicTime => _musicTime;
  set musicTime (double value) {
    _musicTime = value;
    notifyListeners();
  }
  double get musicRate => _musicTime / _musicLength;

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