package com.question.eg009;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Solution {

	public static void main(String[] args) {

		Solution solution = new Solution();
		int[] arr = { 1, 34, 3, 98, 9, 76, 45, 4 };
		List<Integer> digits = solution.findLargestNumber(arr);
		solution.displayLargestNumber(digits);

	}

	public List<Integer> findLargestNumber(int[] arr) {
		List<Integer> nums = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			while (num != 0) {
				int digit = num % 10;
				nums.add(digit);
				num = num / 10;
			}
		}

		Collections.sort(nums, Collections.reverseOrder());

		return nums;

	}

	public void displayLargestNumber(List<Integer> digits) {
		digits.forEach(result -> System.out.print(result));
	}

}