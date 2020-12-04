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
    
    public void printLinkedList() {
    	System.out.println(head.toString());
    }
    public static void main(String[] args) {
		MyLinkedList ll=new MyLinkedList();
		MyNode node1=new MyNode(56);
		MyNode node2=new MyNode(30);
		MyNode node3=new MyNode(70);
		ll.add(node1);
		ll.add(node2);
		ll.add(node3);
		ll.printLinkedList();
	}

}
