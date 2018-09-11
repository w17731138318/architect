package com.wwx.designpatterns.Creational.AbstractFactory;

public interface IDepartment {
	void insert(Department department);

	Department get(String id);
}
