package com.wwx.designpatterns.Creational.SimpleFactoryPattern;

/**
 * MouseFactory1 静态工厂方法模式
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-11 15:44
 * @see
 **/
public class MouseFactory2 {
	public static Mouse produceGeneralMouse() {
		return new GeneralMouse();
	}

	public static Mouse produceWirelessMouse() {
		return new WirelessMouse();
	}
}
