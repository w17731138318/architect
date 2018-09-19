package com.wwx.designpatterns.structuralPattern.BridgePattern;

/**
 * MyBridge
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-18 17:57
 * @see
 **/
public class MyBridge extends Bridge {
	private Jdbc jdbc;

	public MyBridge() {
	}

	public MyBridge(Jdbc jdbc) {
		super(jdbc);
	}

	@Override
	public void connect() {
		getJdbc().connect();
	}
}
