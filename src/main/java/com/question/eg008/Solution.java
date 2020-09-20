package com.question.eg008;

import java.util.LinkedList;
import java.util.List;

class Solution {

	public static void main(String[] args) {

		Solution solution = new Solution();
		int num = 24;
		solution.printPrimeFactors(num);

	}

	public void printPrimeFactors(int n) {
		List<Integer> primeFactors = new LinkedList<>();
		while (n % 2 == 0) {
			primeFactors.add(2);
			n /= 2;
		}

		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				primeFactors.add(i);
				n /= i;
			}
		}

		if (n > 2)
			primeFactors.add(n);

		String primeFactorsCSV = "";
		for (int i = 0, length = primeFactors.size(); i < length; i++)
			primeFactorsCSV += (i == 0 ? "" : ", ") + primeFactors.get(i);

		System.out.println(primeFactorsCSV);

	}

}