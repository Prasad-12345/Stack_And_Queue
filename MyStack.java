package com.bridgelabz.stacksandqueues;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyLinkedList;
/*
 * Ability to create stack of 56->30->70
 */
public class MyStack {
	//variable
	private final MyLinkedList myLinkedList;
    
	//constructor
	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}
	
	//push method to add elements in stack
	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}
	
	//peek method to return top element of the stack
	public INode peek() {
		return myLinkedList.head;
	}
	
	//printStack method to print the stack
	public void printStack() {
		myLinkedList.printMyNodes();
	}
}
