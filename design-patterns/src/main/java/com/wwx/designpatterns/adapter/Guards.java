package com.wwx.designpatterns.adapter;

/**
 * Guards 后卫
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-06 15:30
 * @see
 **/
public class Guards extends Player {
	public Guards(String name) {
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
