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
		HumanFactory humanFactory = new HumanFactory();
		Barracks barracks = humanFactory.createBarracks();
		barracks.productInfantry();
		Ordnance ordnance = humanFactory.createOrdnance();
		ordnance.builderJuggernaut();
	}
}
