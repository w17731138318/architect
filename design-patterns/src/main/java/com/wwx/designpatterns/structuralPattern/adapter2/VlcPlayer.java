package com.wwx.designpatterns.structuralPattern.adapter2;

/**
 * VlcPlayer
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-12 10:31
 * @see
 **/
public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: "+ fileName);
	}

	@Override
	public void playMp4(String fileName) {

	}
}
