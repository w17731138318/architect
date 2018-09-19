package com.wwx.designpatterns.demo;

import com.wwx.designpatterns.structuralPattern.CompositePattern.Tree;
import com.wwx.designpatterns.structuralPattern.CompositePattern.TreeNode;
import org.junit.Test;

import java.util.Enumeration;

/**
 * CompositePattern
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-19 10:54
 * @see
 **/
public class CompositePatternTest {
	@Test
	public void test(){
		Tree tree = new Tree("ROOT");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");

		nodeB.add(nodeC);
		nodeC.setParent(nodeB);
		nodeB.setParent(tree.root);
		tree.root.add(nodeB);
		System.out.println(tree);
		final Enumeration<TreeNode> children = tree.root.getChildren();
		while (children.hasMoreElements()){
			final Enumeration<TreeNode> children1 = children.nextElement().getChildren();
			while (children1.hasMoreElements()){
				final TreeNode treeNode = children1.nextElement();
				System.out.println(treeNode.getParent());
			}
		}
		System.out.println("build the tree finished!");

	}
}
