package com.question.eg002;

class Solution {

	public static void main(String[] args) {
		String str = "wwwwaaadexxxxxx";
		int n = str.length();
		findRunlengthOfString(str, n);
	}

	public static void findRunlengthOfString(String s, int n) {
		for (int i = 0; i < n; i++) {
			int count = 1;
			while (i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
				count++;
				i++;
			}
			System.out.print(s.charAt(i));
			System.out.print(count);
		}
	}
}