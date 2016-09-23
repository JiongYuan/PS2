package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MyInteger_Test {
	MyInteger FirstNbr=new MyInteger(2);
	MyInteger SecondNbr=new MyInteger(3);
	MyInteger ThirdNbr=new MyInteger(4);
	MyInteger FourthNbr=new MyInteger(5);
	MyInteger FifthNbr=new MyInteger(6);


	@Test
	public void test1() {
		assertTrue(FirstNbr.isEven());
		assertFalse(SecondNbr.isEven());
		
		assertFalse(FirstNbr.isOdd());
		assertTrue(SecondNbr.isOdd());
		
		assertTrue(FourthNbr.isPrime());
		assertTrue(ThirdNbr.isPrime());
		assertTrue(FifthNbr.isPrime());
		assertFalse(FirstNbr.isPrime());
		assertFalse(SecondNbr.isPrime());
		assertFalse(ThirdNbr.isPrime());	
	}
	@Test
	public void test2(){
		assertTrue(MyInteger.isEven(4));
		assertFalse(MyInteger.isEven(5));
		
		assertFalse(MyInteger.isOdd(6));
		assertTrue(MyInteger.isOdd(7));
		
		assertTrue(MyInteger.isPrime(8));
		assertTrue(MyInteger.isPrime(9));
		assertFalse(MyInteger.isPrime(10));
		assertFalse(MyInteger.isPrime(11));
	}
	@Test
	public void test3(){
		assertTrue(MyInteger.isEven(FirstNbr));
		assertFalse(MyInteger.isEven(SecondNbr));
		
		
		assertFalse(MyInteger.isOdd(FirstNbr));
		assertTrue(MyInteger.isOdd(SecondNbr));
		
		assertTrue(ThirdNbr.isPrime());
		assertTrue(FourthNbr.isPrime());
		assertTrue(FifthNbr.isPrime());
		assertFalse(FirstNbr.isPrime());
		assertFalse(SecondNbr.isPrime());
		assertFalse(ThirdNbr.isPrime());	
		
	}
	@Test
	public void test4(){
		
		assertTrue(FirstNbr.equals(FirstNbr));
		assertTrue(SecondNbr.equals(SecondNbr));
		assertFalse(ThirdNbr.equals(ThirdNbr));
		assertFalse(FourthNbr.equals(FourthNbr));
		
		
		assertEquals(FirstNbr.getiValue(),8);
		assertEquals(SecondNbr.getiValue(),9);
		assertEquals(ThirdNbr.getiValue(),10);
		assertEquals(FourthNbr.getiValue(),11);
		assertEquals(FifthNbr.getiValue(),12);
		
		}
}
