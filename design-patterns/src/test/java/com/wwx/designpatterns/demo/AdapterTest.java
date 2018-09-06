package com.wwx.designpatterns.demo;

import com.wwx.designpatterns.adapter.*;
import com.wwx.designpatterns.adapter1.*;
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

		Player kobe = new Guards("Kobe");
		Action kobeDefense = kobe.defense();

		Player yaoMing = new Translator("YaoMing");
		Action yaoMingAttack = yaoMing.attack();
		Action yaoMingDefense = yaoMing.defense();

		Targetable target = new Adapter();
		target.say();
		target.run();


		Source source = new Source();
		Targetable target1 = new Wrapper(source);
		target1.say();
		target1.run();

		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();
		System.out.println("==============");
		source1.say();
		source1.run();
		source2.say();
		source2.run();
	}
}
