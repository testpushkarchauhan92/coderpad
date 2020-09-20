package com.question.eg004;

class Solution {

	public static void main(String[] args) {
		int x = 3;
		NumberSum(x, "");
	}

	public static void NumberSum(int number, String suffix) {
		for (int i = 0; i < number; i++) {
			if (i == 0) {
				if(suffix!="")
				System.out.println(number + " " + suffix);
			} else {
				int temp = number - i;
				NumberSum(i, temp + " " + suffix);
			}
		}
	}
}