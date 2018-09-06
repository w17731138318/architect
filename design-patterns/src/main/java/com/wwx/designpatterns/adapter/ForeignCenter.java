package com.wwx.designpatterns.adapter;

/**
 * ForeignCenter
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-06 15:27
 * @see
 **/
public class ForeignCenter {

	private String name;

	public ForeignCenter(String name) {
		this.name = name;
	}

	public Action attackForeign() {
		return new Action(this.name, Thread.currentThread().getStackTrace()[1].getClassName(), Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	public Action defenseForeign() {
		return new Action(this.name, Thread.currentThread().getStackTrace()[1].getClassName(), Thread.currentThread().getStackTrace()[1].getMethodName());
	}
}
