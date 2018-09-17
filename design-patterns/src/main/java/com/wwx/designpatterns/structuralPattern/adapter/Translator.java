package com.wwx.designpatterns.structuralPattern.adapter;

/**
 * Translator
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-06 15:31
 * @see
 **/
public class Translator extends Player {
	private ForeignCenter foreignCenter;

	public Translator(String name) {
		super(name);
		this.foreignCenter = new ForeignCenter(name);
	}

	@Override
	public Action attack() {
		return foreignCenter.attackForeign();
	}

	@Override
	public Action defense() {
		return foreignCenter.defenseForeign();
	}
}
