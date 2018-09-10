package com.wwx.Stack;

import java.io.Serializable;
import java.util.EmptyStackException;

/**
 * mystack
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-09 9:53
 * @see
 **/
public class MyStack<T> implements Stack<T>, Serializable {

	/**
	 * top
	 */
	private int top = -1;
	/**
	 * 容量大小默认为10
	 */
	private int capacity = 10;
	/**
	 * 存放元素的数组
	 */
	private T[] array;

	private int size;

	public MyStack() {
		array = (T[]) new Object[this.capacity];
	}

	public MyStack(int capacity) {
		array = (T[]) new Object[capacity];
	}

	@Override
	public boolean isEmpty() {
		return this.top==-1;
	}

	public int size() {
		return size;
	}

	@Override
	public void push(T data) {
		if (array.length == size) {
			/**
			 * 扩容
			 */
			ensureCapacity(size * 2 + 1);
		}
		array[++top] = data;
		size++;
	}

	@Override
	public T pop() {
		if (isEmpty()) {
			new EmptyStackException();
		}
		size--;
		return array[top--];
	}

	@Override
	public T peek() {
		if (isEmpty()) {
			new EmptyStackException();
		}
		return array[top];
	}

	/**
	 * 扩容的方法
	 *
	 * @param capacity
	 */
	public void ensureCapacity(int capacity) {
		/**
		 * 如果需要拓展的容量比现在数组的容量还小,则无需扩容
		 */
		if (capacity < size) {
			return;
		}
		T[] old = array;
		array = (T[]) new Object[capacity];
		//复制元素
		for (int i = 0; i < size; i++) {
			array[i] = old[i];
		}
	}

	public static void main(String[] args) {
		MyStack<String> myStack = new MyStack<>();
		myStack.push("A");
		System.out.println(myStack.size());
		System.out.println(myStack.isEmpty());
		System.out.println(myStack.peek());
		myStack.push("B");
		System.out.println(myStack.size());
		System.out.println(myStack.isEmpty());
		System.out.println(myStack.peek());
		myStack.push("C");
		System.out.println(myStack.size());
		System.out.println(myStack.isEmpty());
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.size());
		System.out.println(myStack.isEmpty());

	}
}
