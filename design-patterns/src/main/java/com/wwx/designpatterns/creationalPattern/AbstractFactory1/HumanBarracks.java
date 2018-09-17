package com.wwx.designpatterns.creationalPattern.AbstractFactory1;

/**
 * HumanBarracks
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-11 16:58
 * @see
 **/
public class HumanBarracks implements Barracks {

	@Override
	public void productInfantry() {
		System.out.println("生产人族步兵");
	}
}
