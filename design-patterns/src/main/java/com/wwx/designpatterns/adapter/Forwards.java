package com.wwx.designpatterns.adapter;

/**
 * Forwards
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-06 15:28
 * @see
 **/
public class Forwards extends Player {
	public Forwards(String name) {
		super(name);
	}
	@Override
	public Action attack() {
		return new Action(super.name, Thread.currentThread().getStackTrace()[1].getClassName(), Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Override
	public Action defense() {
		return new Action(super.name, Thread.currentThread().getStackTrace()[1].getClassName(), Thread.currentThread().getStackTrace()[1].getMethodName());
	}
}
