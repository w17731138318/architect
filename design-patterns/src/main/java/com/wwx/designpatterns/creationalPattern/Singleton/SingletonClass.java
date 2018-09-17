package com.wwx.designpatterns.creationalPattern.Singleton;

import java.io.Serializable;

/**
 * SingletonClass
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-11 15:24
 * @see
 **/
public enum  SingletonClass implements Serializable {
	INSTANCE;
	/**
	 * name
	 */
	private String name;
	
	/**
	 * age
	 */
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void doSomething(){
		System.out.println("hello world" +this.getName() + this.getAge());
	}

	@Override
	public String toString() {
		return "SingletonClass{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
