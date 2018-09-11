package com.wwx.designpatterns.Creational.AbstractFactory;

public interface IUser {
	void insert(User user);

	User get(String id);
}
