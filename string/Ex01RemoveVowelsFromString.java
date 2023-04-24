package string;

import java.util.Set;

public class Ex01RemoveVowelsFromString {
	
	public static String removeVowels(String str) {
		
		char[] wordChar = str.toCharArray();
		Set<Character> vowelsSet = Set.of('a','e','i','o','u');
		StringBuilder sb = new StringBuilder();
		for (char c : wordChar) {
			if (!vowelsSet.contains(c)) {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		
		String str = "hai how are you";
		
		str = removeVowels(str);
		System.out.println(str);
	}
}
