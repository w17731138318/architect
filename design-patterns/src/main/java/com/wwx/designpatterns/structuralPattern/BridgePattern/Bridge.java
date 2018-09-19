package com.wwx.designpatterns.structuralPattern.BridgePattern;

/**
 * Bridge
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-18 17:55
 * @see
 **/
public abstract class Bridge {
	private Jdbc jdbc;

	public Bridge() {
	}
	public void connect(){
		jdbc.connect();
	}
	/**
	 * 构造方法注入
	 * @param jdbc
	 */
	public Bridge(Jdbc jdbc) {

		this.jdbc = jdbc;
	}
	/**
	 * get set 注入
	 */

	public Jdbc getJdbc() {
		return jdbc;
	}
	public void setJdbc(Jdbc jdbc) {
		this.jdbc = jdbc;
	}
}
