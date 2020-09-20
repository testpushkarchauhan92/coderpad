package com.question.eg003;

class Solution {

	public static void main(String[] args) {
		String str = "aabcddaaadb";
		findLongest(str);
	}

	public static void findLongest(String s) {
		int max_count = 0;
		int count = 0;
		Character max_char = null;
		Character prev_char = null;
		for (int i = 0; i < s.length(); i++) {
			Character current = s.charAt(i);
			if (prev_char == current) {
				count++;
			} else {
				count = 1;
			}

			if (count > max_count) {
				max_count = count;
				max_char = current;
			}

			prev_char = current;

		}

		String key = "";
		for (int i = 0; i < max_count; i++) {
			key += max_char;
		}

		int startIndex = s.indexOf(key);
		int endIndex = startIndex + max_count - 1;
		int max_length = endIndex - startIndex;

		System.out.println("Character=" + max_char + ", start index=" + startIndex + ", end index=" + endIndex
				+ ", length=" + max_length);
	}
}