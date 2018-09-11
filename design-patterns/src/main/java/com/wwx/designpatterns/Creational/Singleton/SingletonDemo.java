package com.wwx.designpatterns.Creational.Singleton;

/**
 * SingletonDemo
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-11 15:27
 * @see
 **/
public class SingletonDemo {
	public static void main(String[] args) {
		SingletonClass instance = SingletonClass.INSTANCE;
		instance.setAge(31);
		instance.setName("张三");
		instance.doSomething();
		System.out.println(instance);
	}

}
