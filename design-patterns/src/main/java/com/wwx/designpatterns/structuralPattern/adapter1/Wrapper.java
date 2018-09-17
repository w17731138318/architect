package com.wwx.designpatterns.structuralPattern.adapter1;

/**
 * Wrapper
 * 对象的适配器模式
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-06 15:46
 * @see
 **/
public class Wrapper implements Targetable {
	private Source source;

	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void say() {
		source.say();
	}

	@Override
	public void run() {
		System.out.println("这是新方法");
	}
}
