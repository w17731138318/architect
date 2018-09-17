package com.wwx.designpatterns.creationalPattern.AbstractFactory1;

/**
 * HumanFactory
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-11 17:02
 * @see
 **/
public class HumanFactory implements WarcraftFactory {

	@Override
	public Barracks createBarracks() {
		return new HumanBarracks();
	}

	@Override
	public Ordnance createOrdnance() {
		return new HumanOrdnance();
	}
}
