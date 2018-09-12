package com.wwx.designpatterns.demo;

import com.wwx.designpatterns.adapter.*;
import com.wwx.designpatterns.adapter1.*;
import com.wwx.designpatterns.adapter2.AudioPlayer;
import org.junit.Test;

/**
 * AdapterTest
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-06 15:34
 * @see
 **/
public class AdapterTest {
	@Test
	public void test() {
		Player james = new Forwards("James");
		Action jamesAttack = james.attack();
		System.out.println(jamesAttack);
		Player kobe = new Guards("Kobe");
		Action kobeDefense = kobe.defense();

		Player yaoMing = new Translator("YaoMing");
		Action yaoMingAttack = yaoMing.attack();
		Action yaoMingDefense = yaoMing.defense();
		System.out.println(yaoMingAttack);

		System.out.println("==============");
		Targetable target = new Adapter();
		target.say();
		target.run();
		System.out.println("==============");

		Source source = new Source();
		Targetable target1 = new Wrapper(source);
		target1.say();
		target1.run();

		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();
		System.out.println("==============");
		source1.say();
		source1.run();
		System.out.println("==============");
		source2.say();
		source2.run();


		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}
}
