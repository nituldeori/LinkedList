package com.linkedlist;

public class MyLinkedList {
	public MyNode tail;
    public MyNode head;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    
    public void add(MyNode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            MyNode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    
    public void append(MyNode myNode) {
        if (this.head == null) {
            this.head = myNode;
        }
        if (this.tail == null) {
            this.tail = myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail=myNode;
        }
    }
    
    public void printLinkedList() {
    	System.out.println(head.toString());
    }
    public static void main(String[] args) {
		MyLinkedList ll=new MyLinkedList();
		MyNode node1=new MyNode(56);
		MyNode node2=new MyNode(30);
		MyNode node3=new MyNode(70);
		ll.append(node1);
		ll.append(node3);
		ll.printLinkedList();
		node1.setNext(node2);
		node2.setNext(node3);
		ll.printLinkedList();
	}

}
