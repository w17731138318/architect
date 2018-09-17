package com.wwx.designpatterns.creationalPattern.AbstractFactory;

public interface IUser {
	void insert(User user);

	User get(String id);
}
