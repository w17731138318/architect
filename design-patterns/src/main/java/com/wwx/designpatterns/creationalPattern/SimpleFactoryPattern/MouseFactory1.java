package com.wwx.designpatterns.creationalPattern.SimpleFactoryPattern;

/**
 * MouseFactory1 多个工厂方法模式
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-11 15:44
 * @see
 **/
public class MouseFactory1 {
	public Mouse produceGeneralMouse(){
		return new GeneralMouse();
	}
	public Mouse produceWirelessMouse(){
		return new WirelessMouse();
	}
}
