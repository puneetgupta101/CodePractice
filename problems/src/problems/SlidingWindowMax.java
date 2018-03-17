package problems;

import java.util.Deque;
import java.util.LinkedList;

/*
 * Link - https://www.geeksforgeeks.org/sliding-window-maximum-maximum-of-all-subarrays-of-size-k/
 * Problem Statement: 
 * Given an array and an integer k, find the maximum for each and every contiguous subarray of size k.
	Examples:
	Input :
	arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}
	k = 3
	Output :
	3 3 4 5 5 5 6
	
	Input :
	arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}
	k = 4
	Output :
	10 10 10 15 15 90 90
 * 
 */
public class SlidingWindowMax {	
	public static int[] printSlidingWindowMax(int arr[], int n, int k) {
		int out[] = new int[n-k+1];
		Deque<Integer> deque = new LinkedList<>();
		int i;
		for(i = 0; i < k; i++) {
			while(!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
				deque.removeLast();
			}
			deque.addLast(i);
		}
		
		for(;i<n; i++) {
			System.out.println(arr[deque.peekFirst()]);
			out[i-k] = arr[deque.peekFirst()];
			
			while(!deque.isEmpty() && deque.peekFirst() <= i-k) {
				deque.removeFirst();
			}
			while(!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
				deque.removeLast();
			}
			deque.addLast(i);
		}
		System.out.println(arr[deque.peekFirst()]);
		out[i-k] = arr[deque.peekFirst()];
		return out;
	}

}
