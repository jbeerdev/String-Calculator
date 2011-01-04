package test;


import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;

public class TestStringCalculator extends TestCase{

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	public void test_addNoneNumbers(){
		
		String input = "";
		int expectedSum = 0;
		assertEquals(expectedSum,Add(input));
		
	}
	
	public void test_addOneNumber(){
		
		String input = "1";
		int expectedSum = 1;
		assertEquals(expectedSum,Add(input));
		
	}
	
	public void test_addTwoNumbers(){
		
		String input = "1,3";
		int expectedSum = 4;
		assertEquals(expectedSum,Add(input));
	}
	
    public void test_addFiveNumbers(){
		
		String input = "1,3,6,3,5";
		int expectedSum = 18;
		assertEquals(expectedSum,Add(input));
	}
	
	
	
	public int Add(String numbers){
		
		int totalSum = 0;
		if(!numbers.equals("")){
			String[] numbersArray = numbers.split(",");	
			for(int i=0;i<numbersArray.length;i++){
				totalSum = totalSum + Integer.valueOf(numbersArray[i]);
			}		
		}
		return totalSum;
	}
	

	

}
