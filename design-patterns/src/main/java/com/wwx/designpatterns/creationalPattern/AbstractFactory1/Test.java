package com.wwx.designpatterns.creationalPattern.AbstractFactory1;

/**
 * t
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-11 17:03
 * @see
 **/
public class Test {
	public static void main(String[] args) {
		WarcraftFactory factory = new HumanFactory();
		Barracks barracks = factory.createBarracks();
		barracks.productInfantry();
		Ordnance ordnance = factory.createOrdnance();
		ordnance.builderJuggernaut();
	}
}
