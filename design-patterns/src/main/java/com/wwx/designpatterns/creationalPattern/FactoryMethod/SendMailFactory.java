package com.wwx.designpatterns.creationalPattern.FactoryMethod;

/**
 * SendMailFactory
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-11 15:56
 * @see
 **/
public class SendMailFactory implements Provider {

	@Override
	public Sender produce() {
		return new MailSend();
	}
}
