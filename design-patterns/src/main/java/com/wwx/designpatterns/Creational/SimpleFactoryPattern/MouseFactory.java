package com.wwx.designpatterns.Creational.SimpleFactoryPattern;

/**
 * MouseFactory 普通工厂方法模式
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-05 15:58
 * @see
 **/
public class MouseFactory {
	public static Mouse buildMouse(String clazzName) {
		switch (clazzName){
			case "WirelessMouse": return new WirelessMouse();
			case "GeneralMouse": return new GeneralMouse();
			default:return null;
		}
	}
}
