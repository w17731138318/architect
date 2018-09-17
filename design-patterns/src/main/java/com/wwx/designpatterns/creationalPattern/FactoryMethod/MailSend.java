package com.wwx.designpatterns.creationalPattern.FactoryMethod;

/**
 * mail
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-11 15:54
 * @see
 **/
public class MailSend implements Sender {

	@Override
	public void send() {
		System.out.println("发送邮件");
	}
}
