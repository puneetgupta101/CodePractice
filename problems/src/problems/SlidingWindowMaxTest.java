package problems;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SlidingWindowMaxTest {
	

	@Test
	void test() {
		int arr[]={12, 1, 78, 90, 57, 89, 56};
        int k=3;
		int out[] = SlidingWindowMax.printSlidingWindowMax(arr, arr.length, k);
		
		int expected[] = {78,90,90,90,89};
		Assert.assertArrayEquals(expected, out);
	}

}
