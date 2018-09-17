package com.wwx.designpatterns.structuralPattern.DecoratorPattern;

/**
 * manger
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-17 15:37
 * @see
 **/
public class Manger implements Order {

	@Override
	public void initOrder() {
		System.out.println("下单");
	}
}
