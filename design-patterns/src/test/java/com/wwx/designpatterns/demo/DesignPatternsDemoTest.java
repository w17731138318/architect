package com.wwx.designpatterns.demo;

import com.wwx.designpatterns.structuralPattern.DecoratorPattern.DecoratorPattern;
import com.wwx.designpatterns.structuralPattern.DecoratorPattern.Manger;
import com.wwx.designpatterns.structuralPattern.DecoratorPattern.Order;
import com.wwx.designpatterns.structuralPattern.ProxyPattern.ChargingWindow;
import com.wwx.designpatterns.structuralPattern.ProxyPattern.ProxyChargingWindow;
import com.wwx.designpatterns.structuralPattern.ProxyPattern.StationChargingWindow;
import org.junit.Test;

public class DesignPatternsDemoTest {
	@Test
	public void decoratorPatternTest(){
		Order order = new Manger();
		Order obj = new DecoratorPattern(order);
		obj.initOrder();
	}
	@Test
	public void ProxyChargingWindow(){
		StationChargingWindow stationChargingWindow = new StationChargingWindow();
		ChargingWindow chargingWindow = new ProxyChargingWindow(stationChargingWindow);
		chargingWindow.charge(10);
	}
}