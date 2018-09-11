package com.wwx.designpatterns.Creational.SimpleFactoryPattern;

/**
 * Simple Factory Pattern
 * MouseFactory
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-05 15:50
 * @see
 **/
public class SimpleFactoryPattern {
	public static void main(String[] args) {
		System.out.println(MouseFactory.buildMouse("WirelessMouse").mouseType());
		System.out.println(MouseFactory.buildMouse("GeneralMouse").mouseType());
		MouseFactory1 mouseFactory1 = new MouseFactory1();
		System.out.println(mouseFactory1.produceGeneralMouse().mouseType());
		System.out.println(mouseFactory1.produceWirelessMouse().mouseType());
		System.out.println(MouseFactory2.produceGeneralMouse().mouseType());
		System.out.println(MouseFactory2.produceWirelessMouse().mouseType());
	}
}
