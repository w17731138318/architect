package com.wwx.designpatterns.adapter2;

/**
 * Mp4Player
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-12 10:32
 * @see
 **/
public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {

	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
	}
}
