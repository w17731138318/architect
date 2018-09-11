package com.wwx.designpatterns.Creational.FactoryMethod;


public class Test {
	public static void main(String[] args) {
		SendMailFactory sendMailFactory = new SendMailFactory();
		Sender produce1 = sendMailFactory.produce();
		SendSmsFactory sendSmsFactory = new SendSmsFactory();
		Sender produce2 = sendSmsFactory.produce();
		produce1.send();
		produce2.send();
	}
}
