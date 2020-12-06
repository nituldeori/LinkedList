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
    
    public void pop() {
    	if(head==null) {
    		head=null;
    	}
    	else {
    		MyNode temp=head.getNext();
    		head=temp;
    		
    	}
    	
    }
    
    public void popLast() {
    	if(head==null) {
    		head=null;
    	}
    	else {
    		MyNode temp=head;
    		while(temp.getNext().getNext()!=null) {
    			temp=temp.getNext();
    		}
    		tail=temp;
            tail.setNext(null);
    	}
    }
    
    public int searchNodeWithValue(int value) {
    	if(head==null) {
    		System.out.println("Linked List is empty");;
    	}
    	else {
    		MyNode temp=head;
    		int i=1;
    		while(temp.getNext()!=null) {
    			if(temp.getKey()==value) {
    				System.out.println("Node with value "+value+" found at node "+i);
    				return i;
    			}
    			temp=temp.getNext();
    			i++;
    		}
    	}
    	System.out.println("No node with value "+value+" found");
    	return -1;
    	
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
		int pos=ll.searchNodeWithValue(30);
	}

}
