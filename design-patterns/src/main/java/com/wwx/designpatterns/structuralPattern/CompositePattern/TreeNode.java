package com.wwx.designpatterns.structuralPattern.CompositePattern;

import java.util.Enumeration;
import java.util.Vector;

/**
 * TreeNode
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-19 10:44
 * @see
 **/
public class TreeNode {
	/**
	 * name
	 */
	private String name;

	/**
	 * parent 父节点
	 */
	private TreeNode parent;
	/**
	 * 子节点
	 */
	private Vector<TreeNode> children = new Vector<TreeNode>();

	/**
	 * 添加子节点
	 *
	 * @param node
	 */
	public void add(TreeNode node) {
		children.add(node);
	}

	/**
	 * 删除子节点
	 *
	 * @param node
	 */
	public void remove(TreeNode node) {
		children.remove(node);
	}

	public Enumeration<TreeNode> getChildren() {
		return children.elements();
	}

	/**
	 * 构造
	 *
	 * @param name
	 */
	public TreeNode(String name) {
		this.name = name;
	}

	/**
	 * get set
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "TreeNode{" +
				"name='" + name + '\'' +
				", parent=" + (parent == null ? "" : parent.getName()) +
				", children=" + children +
				'}';
	}
}
