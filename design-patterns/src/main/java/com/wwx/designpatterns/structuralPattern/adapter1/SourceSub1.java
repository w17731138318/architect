package com.wwx.designpatterns.structuralPattern.adapter1;

/**
 * SourceSub1
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-06 15:51
 * @see
 **/
public class SourceSub1 extends Wrapper2 {
	@Override
	public void say() {
		System.out.println("第一个方法的实现");
	}
}
