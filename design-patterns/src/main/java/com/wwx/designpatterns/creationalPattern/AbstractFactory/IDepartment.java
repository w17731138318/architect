package com.wwx.designpatterns.creationalPattern.AbstractFactory;

public interface IDepartment {
	void insert(Department department);

	Department get(String id);
}
