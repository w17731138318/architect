package com.wwx.designpatterns.SimpleFactoryPattern;

/**
 * WirelessMouse
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-05 15:53
 * @see
 **/
public class WirelessMouse extends Mouse {
	@Override
	public String mouseType() {
		return "这是无线鼠标";
	}
}
