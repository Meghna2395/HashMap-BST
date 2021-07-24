package com.bridzelabz.hashtable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class FrequencyOfWord {

	public static void main(String[] args) {
		String s = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String[] stringArray = s.split(" ");
		HashMap<String, Integer> words = new HashMap<>();
		int index1 = 0, index2 = 0;
		for (String str : stringArray) {
			if (words.containsKey(str)) {
				words.put(str, 1 + words.get(str));
				index1 = s.indexOf(str);
				System.out.println(str + " string index number is " + index1);
				index2 = s.indexOf(str, 13);
				System.out.println(str + " string repetition index number is " + index2);
			} else {
				words.put(str, 1);
			}
		}
		System.out.println(words);
	}
}