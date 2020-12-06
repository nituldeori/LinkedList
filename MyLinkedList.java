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
    		System.out.println("Linked List is empty");
    		head=null;
    	}
    	else {
    		MyNode temp=head.getNext();
    		head=temp;
    		
    	}
    	
    }
    
    public void popLast() {
    	if(head==null) {
    		System.out.println("Linked List is empty");
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
    		System.out.println("Linked List is empty");
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
    
    public void insertAfterGivenNodeValue(int value,int valueInsert) {
    	if(head==null) {
    		System.out.println("Linked List is empty");
    	}
    	else {
    		MyNode temp=head;
    		while(temp.getNext()!=null) {
    			if(temp.getKey()==value) {
    				MyNode newNode=new MyNode(valueInsert);
    				MyNode next=temp.getNext();
    				temp.setNext(newNode);
    				newNode.setNext(next);
    				return;
    			}
    			temp=temp.getNext();
    		}
    		
    	}
    	System.out.println("No node with given value found");
    }
    
    public void deleteGivenNodeWithValue(int value) {
    	if(head==null) {
    		System.out.println("Linked List is empty");
    	}
    	else if(head.getKey()==value) {
    		head=head.getNext();
    	}
    	else {
    		MyNode temp=head;
    		MyNode prev=null;
    		while(temp!=null && temp.getKey()!=value) {
    			prev=temp;
    			temp=temp.getNext();
    			
    		}
    		if(temp==null) {
    			System.out.println("No node with given key is found");
    		}
    		else {
    			prev.setNext(temp.getNext());
    		}
    	}

    }
    
    public int findSizeOfLinkedList() {
    	MyNode temp=head;
    	int size=0;
    	while(temp!=null) {
    		size++;
    		temp=temp.getNext();
    	}
    	return size;
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
		ll.deleteGivenNodeWithValue(30);
		ll.printLinkedList();
		System.out.println(ll.findSizeOfLinkedList());
	}

}
