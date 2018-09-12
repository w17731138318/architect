package com.wwx.designpatterns.adapter2;

/**
 * AudioPlayer
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-12 10:34
 * @see
 **/
public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		/**
		 * 播放 mp3 音乐文件的内置支持
		 */
		if(audioType.equalsIgnoreCase("mp3")){
			System.out.println("Playing mp3 file. Name: "+ fileName);
		}
		/**
		 * mediaAdapter 提供了播放其他文件格式的支持
		 */
		else if(audioType.equalsIgnoreCase("vlc")
				|| audioType.equalsIgnoreCase("mp4")){
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
		else{
			System.out.println("Invalid media. "+
					audioType + " format not supported");
		}
	}
}
