package com.wwx.designpatterns.structuralPattern.BridgePattern;

/**
 * OracleJdbc
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-19 10:34
 * @see
 **/
public class OracleJdbc implements Jdbc {

	@Override
	public void connect() {
		System.out.println("Oracle 连接数据库");
	}
}
