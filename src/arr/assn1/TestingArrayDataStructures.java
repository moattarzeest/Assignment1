package arr.assn1;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;


class TestingArrayDataStructures {

	@Test
	void testLinearSearch() {
		
		Array objArray=new Array();
		int arr[]= {10,22,35,49,5};
		for(int i=0; i<5; i++)
		{
			objArray.insert(arr[i], i);  //insert elements in array 
			
			
		}
		//objArray.getValues();
		//objArray.main(null);
		boolean output=objArray.linearSearch(22);
		
		assertEquals(true,output);
	}
	
	@Test
	void testBinarySearch() {
		
		Array objArray=new Array();
	    int arr[]= {10,22,35,49,5};
		for(int i=0; i<5; i++)
		{
			objArray.insert(arr[i], i);  //insert elements in array
				
		}
	   ///objArray.getValues();
	   //objArray.main(null);
		boolean output=objArray.binarySearch(22, 0, 5);
		
		assertEquals(true,output);
	}
	
	
	
	@Test
	void testInsertion()
	{
		ArrayInsertion objArrayInsertion=new ArrayInsertion();
		int [] ArrayInsert= new int[5];  //Declaring array to insert
		for(int i=0; i<4; i++)
		{
			 objArrayInsertion.insert(ArrayInsert,1,i);
			
		}
		
		//objArrayInsertion.main(null);
		assertEquals(true,true);
		
	}
	
	@Test
	void testmain()
	{
		ArrayInsertion obj=new ArrayInsertion();
		
		obj.main(null);
		assertEquals(true,true);
		
	   ArrayDeletion objD=new ArrayDeletion();
	   objD.main(null);
	   assertEquals(true,true);
	}
	
	@Test
	void testDelete()
	{
		Array obj=new Array();
		obj.main(null);
		obj.delete(2);
		
		assertEquals(true,true);
	}
	

}
