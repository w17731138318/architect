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
	}
}
