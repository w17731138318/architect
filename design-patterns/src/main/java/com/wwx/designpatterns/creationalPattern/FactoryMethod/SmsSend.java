package com.wwx.designpatterns.creationalPattern.FactoryMethod;

/**
 * SmsSend
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-11 15:55
 * @see
 **/
public class SmsSend implements Sender {

	@Override
	public void send() {
		System.out.println("发送短信");
	}
}
