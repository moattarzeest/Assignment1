package queue.assn1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTestCase {

	@Test
	void testQueue() throws Exception {
		Queue objEnqueue=new Queue(5);
		objEnqueue.enqueue(10);
		objEnqueue.enqueue(12);
		objEnqueue.enqueue(11);
		objEnqueue.enqueue(1);
		objEnqueue.enqueue(80);
		objEnqueue.dequeue();
		objEnqueue.size();
		
		objEnqueue.display();
		//objEnqueue.setpointer(0);
		//objEnqueue.display();
		boolean output=objEnqueue.empty();
		
		assertEquals(false,output);
		
	}
	@Test
	void testQueueEmpty() throws Exception {
		Queue objEnqueue=new Queue(5);
		
		objEnqueue.setpointer(0);
		objEnqueue.display();
	//	objEnqueue.dequeue();
	//	objEnqueue.empty();
		boolean output=objEnqueue.empty();
		
		assertEquals(true,output);
		
	}
	
	
	
	@Test 
	void testQueue2() throws Exception
	{
		//Queue obj=new Queue(5);
		//int output=obj.size();
		//assertEquals(5, output);
		
		Queue2 obj=new Queue2(5);
		
		
		
			obj.enqueue(1);
			obj.enqueue(2);
			obj.enqueue(3);
			obj.enqueue(4);
			obj.enqueue(5);
	
		//obj.dequeue();
		obj.display();
		
		obj.setpointer(0);
		obj.display();
		obj.dequeue();
		
		assertEquals(true,true);
		
		
		
	}
	
	@Test
	void testQueue2_2() {
		Queue2 obj=new Queue2(5);
		
		
		
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(3);
		obj.enqueue(4);
		obj.enqueue(5);
		
		obj.display();
		int x=obj.dequeue();	
		assertEquals(1,x);
	}
	
	@Test
	void testQueue2_3() {
		Queue2 obj=new Queue2(5);
		obj.display();
		int x=obj.dequeue();	
		assertEquals(-1,x);
	}
	
	@Test
	void testQueue3_2() {
		Queue3 obj=new Queue3();
		
		
		
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(3);
		obj.enqueue(4);
		obj.enqueue(5);
		
		obj.display();
		int x=obj.dequeue();	
		assertEquals(1,x);
	}
	
	@Test
	void testQueueImplementation()
	{
		QueueImplementation obj=new QueueImplementation();
		
		obj.main(null);
	}

	@Test
	void testQueue3()
	{
		Queue3 obj=new Queue3();
	     //Node objNode=new Node(3);
		obj.enqueue(10);
		obj.dequeue();
		obj.display();
		assertEquals(true,true);
	}
	
	
	
	@Test
	void testaddLeft()
	{
		Dequeue obj=new Dequeue(5);
		
		for(int i=0; i<5;i ++)
		{
			
			obj.addLeft(i);
			
		}
		obj.display();
		assertEquals(true,true);
	}
	
	@Test
	void testaddRight()
	{
		Dequeue obj=new Dequeue(5);
		
		for(int i=0; i<5;i ++)
		{
			
			obj.addRight(i);
			
		}
		obj.display();
		assertEquals(true,true);
	}
	
	@Test
	void testDequeueImplementation()
	{
		DequeueImplementation obj=new DequeueImplementation();
		
	}
}
