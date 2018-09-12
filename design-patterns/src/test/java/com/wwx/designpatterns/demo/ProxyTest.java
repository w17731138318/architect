package com.wwx.designpatterns.demo;

import com.wwx.designpatterns.Proxy.People;
import com.wwx.designpatterns.Proxy.Proxy;
import org.junit.Test;

/**
 * ProxyTest
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-12 11:02
 * @see
 **/
public class ProxyTest {
	@Test
	public void test(){
		People people = new Proxy();
		people.sayHi();
	}
}
