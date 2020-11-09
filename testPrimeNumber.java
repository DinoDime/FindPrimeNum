import static org.junit.Assert.*;

import org.junit.Test;

public class testPrimeNumber {

	@Test
	public void testPosPrimeNum() {
		int actual = PrimeNumber.findPrime(3);
		assertEquals(5, actual);
	}
	@Test
	public void testNegPrimeNum() {
		int actual = PrimeNumber.findPrime(-3);
		assertEquals(0, actual);
	}
	@Test
	public void testZeroPrimeNum() {
		int actual = PrimeNumber.findPrime(0);
		assertEquals(0, actual);
	}
	@Test
	public void test1stPrimeNumber() {
		int actual =  PrimeNumber.findPrime(1);
		assertEquals(2,actual);
	}
	
	@Test
	public void test100thPrimeNumber() {
		int actual =  PrimeNumber.findPrime(100);
		assertEquals(541,actual);
	}
	
	@Test
	public void test1000thPrimeNumber() {
		int actual =  PrimeNumber.findPrime(1000);
		assertEquals(7919,actual);
	}

}
