package com.wwx.designpatterns.Creational.AbstractFactory1;

/**
 * OrcOrdnance
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-11 17:00
 * @see
 **/
public class OrcOrdnance implements Ordnance {

	@Override
	public void builderJuggernaut() {
		System.out.println("建造兽族攻城车");
	}
}
