package com.bridgelabz.stacksandqueues;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyLinkedList;
/*
 * Ability to peak and pop from the stack till it is empty
 */
public class MyStack {
	//variable
	public final MyLinkedList myLinkedList;
    
	//constructor
	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}
	
	/*
	 * push method to add elements in stack
	 */
	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}
	
	/*
	 * peek method to return top element of the stack
	 */
	public INode peek() {
		return myLinkedList.head;
	}
	
	/*
	 * printStack method to print the stack
	 */
	public void printStack() {
		myLinkedList.printMyNodes();
	}
	
	/*
	 * pop method to delete top element
	 */
	public void pop() {
		myLinkedList.pop();
	}
	
	/*
	 * isEmpty method to check stack is empty or not
	 */
	public boolean isEmpty() {
		if (myLinkedList.head != null) {
			return false;
		}
		else {
			return true;
		}
	}
}
