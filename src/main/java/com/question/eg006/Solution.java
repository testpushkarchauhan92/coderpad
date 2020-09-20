package com.question.eg006;

class Solution {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2 };
		int[] arr2 = { 3, 4 };
		System.out.println(findDotProduct(arr1, arr2));

	}

	public static int findDotProduct(int[] arr1, int[] arr2) {

		int dotProduct = 0;
		for (int i = 0; i < arr1.length - 1; i++) {
			dotProduct = arr1[i] * arr2[i] + arr1[i + 1] * arr2[i + 1];
		}

		return dotProduct;

	}

}