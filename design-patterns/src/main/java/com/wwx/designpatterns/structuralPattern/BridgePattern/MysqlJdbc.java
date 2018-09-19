package com.wwx.designpatterns.structuralPattern.BridgePattern;

/**
 * MysqlJdbc
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-18 17:53
 * @see
 **/
public class MysqlJdbc implements Jdbc {

	@Override
	public void connect() {
		System.out.println("mysql 数据库连接");
	}
}
