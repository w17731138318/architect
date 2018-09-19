package com.wwx.designpatterns.demo;

import com.wwx.designpatterns.structuralPattern.BridgePattern.*;
import org.junit.Test;

/**
 * BridgePatterntest
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-18 17:59
 * @see
 **/
public class BridgePatternTest {

	@Test
	public void test(){
		/**
		 * 构造函数注入
		 */
		Bridge bridge1 = new MyBridge(new MysqlJdbc());
		bridge1.connect();

		/**
		 * set注入
		 */
		Bridge bridge2 = new MyBridge();
		Jdbc db2Jdbc = new DB2Jdbc();
		bridge2.setJdbc(db2Jdbc);
		bridge2.connect();
		/**
		 * 新增 OracleJdbc 驱动时 只需增加OracleJdbc实现。即可使用
		 */
		Bridge bridge3 = new MyBridge();
		Jdbc oracleJdbc = new OracleJdbc();
		bridge3.setJdbc(oracleJdbc);
		bridge3.connect();
	}
}
