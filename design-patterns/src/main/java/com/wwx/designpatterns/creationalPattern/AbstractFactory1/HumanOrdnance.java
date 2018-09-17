package com.wwx.designpatterns.creationalPattern.AbstractFactory1;

/**
 * HumanOrdnance
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-11 16:59
 * @see
 **/
public class HumanOrdnance implements Ordnance {

	@Override
	public void builderJuggernaut() {
		System.out.println("建造人族攻城车");
	}
}
