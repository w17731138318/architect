package com.wwx.designpatterns.creationalPattern.AbstractFactory1;

/**
 * OrcFactory
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-11 17:01
 * @see
 **/
public class OrcFactory implements WarcraftFactory {

	@Override
	public Barracks createBarracks() {
		return new OrcBarracks();
	}

	@Override
	public Ordnance createOrdnance() {
		return new OrcOrdnance();
	}
}
