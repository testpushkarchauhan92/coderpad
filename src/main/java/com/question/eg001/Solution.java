package com.question.eg001;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Solution {

	static List<String> list = new LinkedList<>();

	public static void main(String[] args) {
		String str = "abdd";
		int limit = 2;
		String ans = "";
		findAllSubsequencesForLimit(str, ans, limit);
		Set<String> set = new LinkedHashSet<>(list);
		set.stream().filter(item -> item.length() == 2 && item.charAt(0) != item.charAt(1))
				.forEach(result -> System.out.print(result + " "));
	}

	public static void findAllSubsequencesForLimit(String s, String ans, int limit) {

		if (s == null) {
			return;
		}

		if (s.length() == 0) {
			list.add(ans);
			return;
		}

		findAllSubsequencesForLimit(s.substring(1), ans + s.charAt(0), limit);
		findAllSubsequencesForLimit(s.substring(1), ans, limit);
	}
}