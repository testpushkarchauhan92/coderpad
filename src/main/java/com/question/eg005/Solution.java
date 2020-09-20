package com.question.eg005;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {

	public static void main(String[] args) {

		String[] words = { "art", "cheese", "cat", "rat", "tar", "act", "tca" };
		System.out.println(groupAnagrams(words));
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
		for (String str : strs) {
			char[] arr = str.toCharArray();
			Arrays.sort(arr);
			String tmp = new String(arr);
			if (map.get(tmp) == null)
				map.put(tmp, new ArrayList<String>());
			map.get(tmp).add(str);
		}
		return map.values().stream().collect(Collectors.toList());
	}
}