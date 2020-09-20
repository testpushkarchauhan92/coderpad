package com.question.eg011;

class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String str = "getting good at coding needs a lot of practice";
		solution.reverseStringByWords(str);
	}

	public void reverseStringByWords(String str) {
		String[] splitStr = str.split(" ");
		for (int i = splitStr.length - 1; i >= 0; i--) {
			System.out.print(splitStr[i] + " ");
		}
	}

}