package com.wwx.designpatterns.Creational.AbstractFactory;

import lombok.Data;

/**
 * user
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-11 16:27
 * @see
 **/
@Data
public class User {
	private String id;
	private String name;

	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}

}
