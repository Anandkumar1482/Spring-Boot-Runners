package com.array.programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NumberOfOccurenceOfString {
	public static void main(String[] args) {

		String str = "abbcccddddeffgghaeeeeee";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map.get(str.charAt(i)) != null) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}

		StringBuffer sb = new StringBuffer();
		Set<Entry<Character, Integer>> entry = map.entrySet();
		for (Entry<Character, Integer> entry2 : entry) {
			sb.append(entry2.getKey());
			sb.append(entry2.getValue());
		}
		System.out.println(sb.toString());
	}
}
