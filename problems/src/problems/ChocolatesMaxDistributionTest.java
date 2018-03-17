package problems;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class ChocolatesMaxDistributionTest {

	@Test
	void test() {
		int arr[] = { 2, 7, 6, 1, 4, 5 };
		int n = arr.length;
		int k = 3;
		int out = ChocolatesMaxDistribution.function(arr, n, k);
		System.out.println("Maximum number of chocolates: "
		                    + out);
		
		Assert.assertEquals(6, out);
	}

}
