package com.wwx.designpatterns.creationalPattern.AbstractFactory1;

public interface WarcraftFactory {
	/**
	 * 生产兵
	 * @return
	 */
	Barracks createBarracks();

	/**
	 * 攻城车
	 * @return
	 */
	Ordnance createOrdnance();
	/**
	 * 塔
	 */
}
