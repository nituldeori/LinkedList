package com.linkedlist;

public class MyQueue {
	private final MyLinkedList myLinkedList;
	public MyQueue() {
		this.myLinkedList=new MyLinkedList();
	}
	
	public MyLinkedList getMyLinkedList() {
		return myLinkedList;
	}
	
	public void enqueue(MyNode myNode) {
		myLinkedList.append(myNode);
	}
	
	public MyNode peak() {
		return myLinkedList.head;
	}
	
	public void pop() {
		myLinkedList.pop();
	}
	
	public static void main(String[] args) {
		MyNode Node1=new MyNode(56);
		MyNode Node2=new MyNode(30);
		MyNode Node3=new MyNode(70);
		MyQueue myQueue=new MyQueue();
		myQueue.enqueue(Node1);
		myQueue.enqueue(Node2);
		myQueue.enqueue(Node3);
		myQueue.getMyLinkedList().printLinkedList();
	}

}
