package com.wwx.designpatterns.Proxy;

/**
 * Chinese people
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-12 10:59
 * @see
 **/
public class ChinesePeople implements People {

	@Override
	public void sayHi() {
		System.out.println("你好");
	}
}
