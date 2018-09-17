package com.wwx.designpatterns.structuralPattern.Proxy;

/**
 * Proxy
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-12 10:59
 * @see
 **/
public class Proxy implements People {
	private ChinesePeople chinesePeople;

	public Proxy() {
		super();
		this.chinesePeople = new ChinesePeople();
	}

	@Override
	public void sayHi() {
		before();
		chinesePeople.sayHi();
		atfer();
	}
	private void atfer() {
		System.out.println("after proxy!");
	}
	private void before() {
		System.out.println("before proxy!");
	}
}
