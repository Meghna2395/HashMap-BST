package com.bridzelabz.hashtable;

import java.util.Hashtable;

public class FrequencyOfWord {

	public static void main(String[] args) {

		Hashtable<String, Integer> hashtable = new Hashtable<>();

		String str = "To be or not to be";
		String[] stringArray = str.split("");

		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
			if (hashtable.containsKey(stringArray[i])) {

			}
			hashtable.put(stringArray[i], 0);
		}
	}

}
