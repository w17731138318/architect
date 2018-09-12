package com.wwx.designpatterns.Proxy;

/**
 * EnglandPeople
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-12 11:05
 * @see
 **/
public class EnglandPeople implements People {

	@Override
	public void sayHi() {
		System.out.println("Hi");
	}
}
