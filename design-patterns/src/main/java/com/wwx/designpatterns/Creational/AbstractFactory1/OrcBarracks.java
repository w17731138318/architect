package com.wwx.designpatterns.Creational.AbstractFactory1;

/**
 * OrcBarracks
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-11 16:57
 * @see
 **/
public class OrcBarracks implements Barracks {
	@Override
	public void productInfantry() {
		System.out.println("生产兽族步兵");
	}
}
