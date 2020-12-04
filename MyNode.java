package com.linkedlist;

public class MyNode {
	private int key;
	private MyNode next;
	
	public MyNode(int key) {
		this.key=key;
		this.next=null;
	}
	
	public int getKey() {
		return key;
	}
	
	public void setKey(int key) {
		this.key=key;
	}
	
	public MyNode getNext() {
		return next;
	}
	
	public void setNext(MyNode next) {
		this.next=next;
	}
	
	@Override
	public String toString() {
		StringBuilder myNodeString=new StringBuilder();
		myNodeString.append("MyNode{"+"key=").append(key).append('}');
		if(next!=null)
            myNodeString.append("->").append(next);
        return myNodeString.toString();
		
	}
	public static void main(String[] args) {
		MyNode node1=new MyNode(30);
		MyNode node2=new MyNode(56);
		MyNode node3=new MyNode(70);
		node1.setNext(node2);
		node2.setNext(node3);
		System.out.println(node1.toString());
	}

}
