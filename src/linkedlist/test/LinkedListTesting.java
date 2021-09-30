package linkedlist.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTesting {

	@Test
	void testCircularFront() {
		CircularLinkedList obj = new CircularLinkedList();
		
		
		obj.pushFront(10);
		obj.pushFront(1);
		obj.pushFront(11);
		obj.pushFront(17);
		obj.pushFront(20);
		
		
		
	
		CircularLinkedList.Node node_1;
		
		
		
		
		node_1=obj.gethead();
		
		
		obj.popFront();
		
		
		obj.display();
		
		
		assertEquals(20, node_1.key);
	}

	@Test
	void testCircularBack() {
		CircularLinkedList obj = new CircularLinkedList();
		LinkedList obj2=new LinkedList();
		
		obj.pushBack(10);
		obj.pushBack(1);
		obj.pushBack(11);
		obj.pushBack(17);
		obj.pushBack(20);
		
		
		
		
		CircularLinkedList.Node node_1;
		
		
		
		node_1=obj.gethead();
		
		

		obj.popBack();
		obj.display();
		
		
		
		assertEquals(10, node_1.key);
	}
	
	@Test
	void testLinkedListFront()
	{
		LinkedList obj2=new LinkedList();
		obj2.pushFront(10);
		obj2.pushFront(1);
		obj2.pushFront(11);
		obj2.pushFront(17);
		obj2.pushFront(20);
		
		LinkedList.Node node_2;
		node_2=obj2.gethead();
		obj2.swap();
		obj2.display();
		assertEquals(10, node_2.key);
	}

	@Test
	void testLinkedListBack()
	{
		LinkedList obj2=new LinkedList();
		obj2.pushBack(10);
		obj2.pushBack(1);
		obj2.pushBack(11);
		obj2.pushBack(17);
		obj2.pushBack(20);
		
		
		LinkedList.Node node_2;
		node_2=obj2.gethead();
		obj2.swap();
		obj2.display();
		assertEquals(20, node_2.key);
	}
	
	@Test
	void testLinkedList2Front()
	{
		LinkedList2 obj3= new LinkedList2();
		obj3.pushFront(10);
		obj3.pushFront(1);
		obj3.pushFront(11);
		obj3.pushFront(17);
		obj3.pushFront(20);
		LinkedList2.Node node_3;
		node_3=obj3.gethead();
		obj3.popFront();
		obj3.display();
		
		assertEquals(20, node_3.key);
		
	}
	
	@Test
	void testLinkedList2Back()
	{
		LinkedList2 obj3= new LinkedList2();
		obj3.pushBack(10);
		obj3.pushBack(1);
		obj3.pushBack(11);
		obj3.pushBack(17);
		obj3.pushBack(20);
		
		LinkedList2.Node node_3;
		node_3=obj3.gethead();
		obj3.popBack();
		obj3.pop(0);
		obj3.pop(2);
		obj3.display();
		
		assertEquals(10, node_3.key);
		
	}
	
	@Test
	void testLinkedList3Front() throws Exception
	{
		LinkedList3 obj= new LinkedList3();
		obj.pushFront(10);
		obj.pushFront(1);
		obj.pushFront(11);
		obj.pushFront(17);
		obj.pushFront(20);
		
		obj.add(10);
		obj.add(11);
		obj.add(13);
		obj.add(15);
		obj.add(20);
	int val=obj.topFront();
	obj.popFront();
	obj.display();
	assertEquals(20,val);
	
		
	}
	
	@Test
	void testLinkedList3Back() throws Exception
	{
		LinkedList3 obj= new LinkedList3();
		obj.pushBack(10);
		obj.pushBack(1);
		obj.pushBack(11);
		obj.pushBack(17);
		obj.pushBack(20);
		
		obj.add(10);
		obj.add(11);
		obj.add(13);
		obj.add(15);
		obj.add(20);
	int val=obj.topBack();
	obj.display();
	obj.popFront();
	assertEquals(20,val);
	
		
	}

}
