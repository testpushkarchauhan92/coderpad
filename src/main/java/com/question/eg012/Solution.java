package com.question.eg012;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] words = { "aaa", "bbb", "ccc", "bbb", "aaa", "aaa" };
		solution.reverseStringByWords(words);
	}

	public void reverseStringByWords(String[] words) {
		Map<String, Integer> map = new TreeMap<>();
		for (String word : words) {
			String key = word;
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}

		Map<String, Integer> sortByValuesMap = sortByValues(map);

		String second = sortByValuesMap.entrySet().stream().skip(1).map(map2 -> map2.getKey()).findFirst().get();

		System.out.println(second);

	}

	public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
		Comparator<K> valueComparator = new Comparator<K>() {
			public int compare(K k1, K k2) {
				int compare = map.get(k2).compareTo(map.get(k1));
				if (compare == 0)
					return 1;
				else
					return compare;
			}
		};

		Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
		sortedByValues.putAll(map);
		return sortedByValues;
	}
}