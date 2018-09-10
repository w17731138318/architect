package com.jvm.jvmdemo.vo;

/**
 * user
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-10 11:11
 * @see
 **/
public class User {
	/**
	 * id
	 */
	private int id;
	
	/**
	 * name
	 */
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(int id, String name) {

		this.id = id;
		this.name = name;
	}
}
