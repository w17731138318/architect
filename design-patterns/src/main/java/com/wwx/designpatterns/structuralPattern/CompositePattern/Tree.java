package com.wwx.designpatterns.structuralPattern.CompositePattern;

/**
 * Tree
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-19 10:52
 * @see
 **/
public class Tree {
	public TreeNode root = null;

	public Tree(String rootName) {
		root = new TreeNode(rootName);
	}

	@Override
	public String toString() {
		return "Tree{" +
				"root=" + root +
				'}';
	}
}
