package com.wwx.designpatterns.structuralPattern.ProxyPattern;

/**
 * ProxyChargingWindow
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-17 15:51
 * @see
 **/
public class ProxyChargingWindow implements ChargingWindow{

	private StationChargingWindow stationChargingWindow;

	public ProxyChargingWindow(StationChargingWindow stationChargingWindow) {
		this.stationChargingWindow = stationChargingWindow;
	}

	@Override
	public void charge(int money) {
		before(money);
		stationChargingWindow.charge(money);
		atfer(money);
	}

	private void atfer(int money) {
		System.out.println("代理窗口交易结束");
	}
	private void before(int money) {
		System.out.println("代理窗口收到："+money);
	}
}
