package com.wwx.designpatterns.structuralPattern.DecoratorPattern;

/**
 * DecoratorPattern
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-17 15:38
 * @see
 **/
public class DecoratorPattern implements Order {

	private Order order;

	public DecoratorPattern(Order order) {
		super();
		this.order = order;
	}

	@Override
	public void initOrder() {
		System.out.println("验证支付信息");
		order.initOrder();
		System.out.println("发起支付");
	}
}
