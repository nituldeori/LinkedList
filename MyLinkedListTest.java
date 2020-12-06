package com.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MyLinkedListTest {

	@Test
	public void testSearchNodeWithValue() {
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
		assertEquals(2, pos);
	}

}
