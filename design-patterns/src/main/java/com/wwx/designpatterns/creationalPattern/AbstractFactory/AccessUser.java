package com.wwx.designpatterns.creationalPattern.AbstractFactory;

/**
 * AccessUser
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-11 16:31
 * @see
 **/
public class AccessUser implements IUser{

	@Override
	public void insert(User user) {
		Access.getInstance().addUser(user);
	}

	@Override
	public User get(String id) {
		return Access.getInstance().getUser(id);
	}
}
