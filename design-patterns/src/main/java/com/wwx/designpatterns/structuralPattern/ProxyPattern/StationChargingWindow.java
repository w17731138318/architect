package com.wwx.designpatterns.structuralPattern.ProxyPattern;

/**
 * station
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-17 15:49
 * @see
 **/
public class StationChargingWindow implements ChargingWindow {

	@Override
	public void charge(int money) {
		System.out.println("车站收到:" + money + "元");
	}
}
