package com.wwx.api.impl;

import com.wwx.api.GreetingService;

/**
 * GreetingServiceImpl
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-07 9:45
 * @see
 **/
public class GreetingServiceImpl implements GreetingService {
	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}
}
