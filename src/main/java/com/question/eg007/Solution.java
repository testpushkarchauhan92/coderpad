package com.question.eg007;

class Solution {

	public static void main(String[] args) {

		int[] nums = { 12, 13, 1, 10, 34, 1 };
		findSecondSmallestNumber(nums);

	}
	
	public static void findSecondSmallestNumber(int[] arr) {
		int firstSmallestNum = Integer.MAX_VALUE;
		int secondSmallestNum = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < firstSmallestNum) {
				secondSmallestNum = firstSmallestNum;
				firstSmallestNum = arr[i];
			} else if (arr[i] < secondSmallestNum && firstSmallestNum != arr[i]) {
				secondSmallestNum = arr[i];
			}
		}
		System.out.println(secondSmallestNum);
	}

}