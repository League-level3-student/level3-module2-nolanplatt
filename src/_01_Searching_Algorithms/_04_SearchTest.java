package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] array = {"Bob", "Jerry", "Jack"};
		_00_LinearSearch ls = new _00_LinearSearch();
		assertEquals(2, ls.linearSearch(array, "Jack"));
		assertEquals(-1, ls.linearSearch(array, "Nolan"));
		assertEquals(1, ls.linearSearch(array, "Jerry"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] array = {1, 2, 3, 4};
		_01_BinarySearch bs = new _01_BinarySearch();
		assertEquals(2, bs.binarySearch(array, 1, 4, 2));
		assertEquals(3, bs.binarySearch(array, 1, 4, 3));
		assertEquals(4, bs.binarySearch(array, 1, 4, 4));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
