package com.bridgelabz.stacksandqueues;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyNode;

class MyQueueTest {
    /*
     * Test case to check enqueue method
     */
	@Test
	public void toCreateQueue() {
		//value assigned to each node using object
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		//object of MyQueue class
		MyQueue myQueue = new MyQueue();
		
		//enqueue method
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		
		//printQueue method
		myQueue.printQueue();
		INode deque = myQueue.dequeue();
		
		//Test condition
		Assert.assertEquals(deque, myFirstNode);
	}
	
	/*
	 * Test case to check dequeue method
	 */
	@Test
	public void toCheckDequeMethod() {
		//value assigned to each node using object
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		//object of MyQueue class
		MyQueue myQueue = new MyQueue();
		
		//enqueue method
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		
		//printQueue method
		myQueue.printQueue();
		
		MyStack myStack = new MyStack();
		
		//using deque method till queue become empty
		while(!myQueue.isEmpty()) {
			myQueue.dequeue();
		}

		//Test condition
		Assert.assertTrue(myQueue.isEmpty());
	}
}
