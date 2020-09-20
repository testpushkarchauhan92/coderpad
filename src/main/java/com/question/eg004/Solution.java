package com.question.eg004;

class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int x = 3;
		solution.numberSum(x, "");
	}

	public void numberSum(int number, String suffix) {
		for (int i = 0; i < number; i++) {
			if (i == 0) {
				if (suffix != "")
					System.out.println(number + " " + suffix);
			} else {
				int temp = number - i;
				numberSum(i, temp + " " + suffix);
			}
		}
	}
}