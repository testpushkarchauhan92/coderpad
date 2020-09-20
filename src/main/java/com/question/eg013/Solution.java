package com.question.eg013;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {

		Solution solution = new Solution();
		int[] arr = { 4, 3, 6, 2, 1, 1 };
		List<List<Integer>> findAllMissingAndDuplicateValues = solution.findAllMissingAndDuplicateValues(arr);
		Integer duplicate = findAllMissingAndDuplicateValues.get(0).get(0);
		Integer missing = findAllMissingAndDuplicateValues.get(1).get(0);
		System.out.println(duplicate + ", " + missing);
	}

	public List<List<Integer>> findAllMissingAndDuplicateValues(int[] arr) {
		if (arr.length == 0) {
			return new ArrayList<>();
		}

		int i = 0;
		while (i < arr.length) {
			if (arr[i] != arr[arr[i] - 1]) {
				int otherIndex = arr[i] - 1;

				int x = arr[i];
				arr[i] = arr[otherIndex];
				arr[otherIndex] = x;
			} else {
				i++;
			}
		}

		List<Integer> missingValues = new ArrayList<>();
		List<Integer> duplicateValues = new ArrayList<>();

		for (i = 0; i < arr.length; i++) {
			if (arr[i] != i + 1) {
				missingValues.add(i + 1);
				duplicateValues.add(arr[i]);
			}
		}

		List<List<Integer>> result = new ArrayList<>();
		result.add(duplicateValues);
		result.add(missingValues);

		return result;
	}

}
