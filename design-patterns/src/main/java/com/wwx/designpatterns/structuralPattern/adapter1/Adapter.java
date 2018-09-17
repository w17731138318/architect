package com.wwx.designpatterns.structuralPattern.adapter1;

/**
 * Adapter 类的适配器模式
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-06 15:41
 * @see
 **/
public class Adapter extends Source implements Targetable {
	@Override
	public void run() {
		System.out.println("这是新方法");
	}
}
