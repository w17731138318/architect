package com.wwx.designpatterns.creationalPattern.SimpleFactoryPattern;

/**
 * GeneralMouse
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-05 15:54
 * @see
 **/
public class GeneralMouse extends Mouse {
	@Override
	public String mouseType() {
		return "这是普通鼠标";
	}
}
