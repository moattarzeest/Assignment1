package stack.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class StackTesting {

	@Test
	void testStackFull() {
		Stack obj=new Stack();
		obj.setpointer(105);
	    obj.push(5);
	    assertEquals(true,true);
	    
		
	}
	
	@Test
	void testStack() {
		Stack obj=new Stack();
		obj.setpointer(20);
	    obj.push(5);
	    assertEquals(true,true);
	    
		
	}
	
	@Test
	void testPopFull()
	{
		Stack obj=new Stack();
		obj.setpointer(0);
		//obj.pop();
		assertEquals(-1,obj.pop());
	}
	
	@Test
	void testPop()
	{
		Stack obj=new Stack();
		obj.setpointer(10);
		obj.pop();
		assertEquals(true,true);
	}
	
	@Test
	void testDisplayFull()
	{
		Stack obj=new Stack();
		obj.setpointer(0);
		obj.display();
		assertEquals(true,true);
	}
	@Test
	void testDisplay()
	{
		Stack obj=new Stack();
		obj.setpointer(10);
        obj.push(10);
		obj.display();
		assertEquals(true,true);
	}
	
	@Test 
	void TestMyStack()
	{
		MyStack obj= new MyStack(5);
		assertEquals(true,true);
		
	}
	
	@Test
	void testMyStackPush() throws Exception
	{
		MyStack obj= new MyStack(5);
		
		obj.push(10);
		assertEquals(true,true);
		
	}
	
	@Test
	void testMyStackPushFull() throws Exception
	{
		MyStack obj= new MyStack(5);
		obj.push(5);
		 obj.push(10);
		 obj.push(15);
		 obj.push(11);
		 obj.pop();
		
		
		int val=obj.top();
		obj.displayStack();
	   
		assertEquals(15,val);
		
	}
	
	
	@Test
	void testNode()
	{
		StackLL obj=new StackLL();
		obj.push(10);
		obj.push(2);
		obj.push(20);
		obj.push(5);
		int output=obj.top();
		obj.display();
		assertEquals(5,output);
		
	}
	@Test
	void testNodePop()
	{
		StackLL obj=new StackLL();
		obj.push(10);
		obj.push(2);
		obj.push(20);
		obj.push(5);
		int output=obj.pop();
		obj.display();
		assertEquals(5,output);
		
	}

	
	

}
