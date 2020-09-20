package com.question.eg010;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Solution {

	public static void main(String[] args) {

		Solution solution = new Solution();
		int[] arr1 = { 5, 8, 9 };
		int[] arr2 = { 4, 7, 8 };
		int m = arr1.length;
		int n = arr2.length;
		int[] mergedArr = solution.merge(arr1, m, arr2, n);
		System.out.println(Arrays.toString(mergedArr));

	}

	public int[] merge(int[] arr1, int m, int[] arr2, int n) {
		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < m; i++) {
			list.add(arr1[i]);
		}
		for (int i = 0; i < n; i++) {
			list.add(arr2[i]);
		}
		Collections.sort(list);
		int[] sortedArr = new int[list.size()];
		int count = 0;
		for (int num : list) {
			sortedArr[count++] = num;
		}
		return sortedArr;
	}

}