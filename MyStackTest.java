package com.bridgelabz.stacksandqueues;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyNode;

class MyStackTest {
    /*
     * Test case to check stack
     */
	@Test
	public void givenThreeNumbersWhenAddedToStackShouldShouldHaveLastAddedNode() {
		//value assigned to each node using object
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		//object of MyStack class
		MyStack myStack = new MyStack();
		//push nodes to stack
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.printStack();
		INode peek = myStack.peek();
		
		//Test Condition
		Assert.assertEquals(myThirdNode, peek);
	}
}
