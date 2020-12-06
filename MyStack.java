package com.linkedlist;

public class MyStack {
	private final MyLinkedList myLinkedList;
	public MyStack() {
		this.myLinkedList=new MyLinkedList();
	}
	
	public MyLinkedList getMyLinkedList() {
		return myLinkedList;
	}
	public void push(MyNode myNode) {
		myLinkedList.add(myNode);
	}
	
	public MyNode peak() {
		return myLinkedList.head;
	}
	
	public void pop() {
		myLinkedList.pop();
	}
	public static void main(String[] args) {
		MyNode Node1=new MyNode(70);
		MyNode Node2=new MyNode(30);
		MyNode Node3=new MyNode(56);
		MyStack myStack=new MyStack();
		myStack.push(Node1);
		myStack.push(Node2);
		myStack.push(Node3);
		myStack.getMyLinkedList().printLinkedList();
		System.out.println(myStack.peak().getKey());
		myStack.pop();
		System.out.println(myStack.peak().getKey());
		myStack.pop();
		System.out.println(myStack.peak().getKey());
		myStack.pop();
		myStack.pop();
	}

}
