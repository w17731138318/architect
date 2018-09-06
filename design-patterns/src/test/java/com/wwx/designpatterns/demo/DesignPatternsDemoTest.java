package com.wwx.designpatterns.demo;

import org.junit.Test;

public class DesignPatternsDemoTest {
	@Test
	public void testDemo(){
		DesignPatternsDemo demo = new DesignPatternsDemo("张三",31);
		demo.setAge(30);
		System.out.println(demo);
	}
}