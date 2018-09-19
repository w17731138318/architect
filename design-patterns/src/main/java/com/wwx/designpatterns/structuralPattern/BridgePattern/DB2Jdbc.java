package com.wwx.designpatterns.structuralPattern.BridgePattern;

/**
 * DB2Jdbc
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-18 17:54
 * @see
 **/
public class DB2Jdbc implements Jdbc {

	@Override
	public void connect() {
		System.out.println("db2 数据库连接");
	}
}
