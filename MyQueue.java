package com.bridgelabz.stacksandqueues;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyLinkedList;
/*
 * Author: Prasad
 * Ability to dequeue from the beginning
 */
public class MyQueue {
    
	private final MyLinkedList myLinkedList;

	//constructor
	public MyQueue() {
		this.myLinkedList = new MyLinkedList();
	}
	
	/*
	 * enqueue method to append element
	 */
	public void enqueue(INode element) {
		myLinkedList.append(element);
	}
	
	/*
	 * printQueue method to print queue
	 */
	public void printQueue() {
		myLinkedList.printMyNodes();
	}
	
	/*
	 * dequeue method to delete first element
	 */
	public INode dequeue() {
		return myLinkedList.pop();
	}
	
	/*
	 * isEmpty method to check queue is empty or not
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
