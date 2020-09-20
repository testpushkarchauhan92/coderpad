package com.question.eg009;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

class Solution {

	public static void main(String[] args) {

		int[] arr = { 1, 34, 3, 98, 9, 76, 45, 4 };
		Integer[] numbers = IntStream.of(arr).boxed().toArray(Integer[]::new);
		Arrays.sort(numbers, Collections.reverseOrder());
		Arrays.stream(numbers).forEach(num -> System.out.print(num));

	}

}