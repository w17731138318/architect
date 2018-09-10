package com.wwx.Stack;

/**
 * stack
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-09 9:48
 * @see
 **/
public interface Stack<T> {
	/**
	 * 栈是否为空
	 * @return
	 */
	boolean isEmpty();

	/**
	 * 添加数据入栈
	 * @param data
	 */
	void push(T data);

	/**
	 * 取出栈顶数据
	 * @return
	 */
	T pop();

	/**
	 * 查看栈顶数据
	 * @return
	 */
	T peek();
}
