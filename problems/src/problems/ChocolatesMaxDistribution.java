package problems;

import java.util.HashMap;
import java.util.Map;

public class ChocolatesMaxDistribution {

	//Link - https://www.geeksforgeeks.org/maximum-number-chocolates-distributed-equally-among-k-students/
	public static int function(int arr[], int n, int k) {
		
		int[] sum = new int[n];
		sum[0] = arr[0];
		for(int i=1; i < n; i++) {
			sum[i] = sum[i-1] + arr[i];
		}
		int max = 0;
		Map<Integer, Integer> mapReminder = new HashMap<>();
		
		for (Integer j = 0; j < n; j++) {
			Integer remider = sum[j] % k;
			if (!mapReminder.containsKey(remider)) {
				mapReminder.put(remider, j);
			}

			if (max < (sum[j] - sum[mapReminder.get(remider)])) {
				max = (sum[j] - sum[mapReminder.get(remider)]);
			}
		}
		System.out.println("max sum: " + max);
		return max/k;
		
	}

}
