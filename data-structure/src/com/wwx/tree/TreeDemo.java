package com.wwx.tree;

/**
 * demo
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-03 15:55
 * @see
 **/
public class TreeDemo {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(3, 3.666);
		tree.insert(1, 1.111);
		tree.insert(2, 2.362);
		tree.insert(4, 4.672);
		tree.insert(5, 5.865);
		tree.insert(6, 6.681);
		Node node=tree.find(3);
		System.out.println(node);
		Node[] nodes = tree.mVal();
		System.out.println(nodes[0]);
		System.out.println(nodes[1]);
	}
}
