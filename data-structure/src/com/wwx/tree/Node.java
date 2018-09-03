package com.wwx.tree;

/**
 * node
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-03 14:25
 * @see
 **/
public class Node {
	public int iData;
	public double dData;
	public Node leftNode;
	public Node rightNode;

	public int getiData() {
		return iData;
	}

	public void setiData(int iData) {
		this.iData = iData;
	}

	public double getdData() {
		return dData;
	}

	public void setdData(double dData) {
		this.dData = dData;
	}

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

	//显示树节点信息
	public void showNode() {
		System.out.println("{ " + iData + "," + dData + " }");
	}

	@Override
	public String toString() {
		return "Node{" +
				"iData=" + iData +
				", dData=" + dData +
				", leftNode=" + leftNode +
				", rightNode=" + rightNode +
				'}';
	}
}
