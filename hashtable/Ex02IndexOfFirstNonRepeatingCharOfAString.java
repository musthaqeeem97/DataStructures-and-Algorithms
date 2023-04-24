package hashtable;

// return the index of first non repeating char ,if not found return -1.
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex02IndexOfFirstNonRepeatingCharOfAString {
	
	public int indexOfChar(String word) {
		 char[] wordChar = word.toCharArray();
		 Map<Character, Integer> map = new HashMap<>();
		
		 for (char c : wordChar) {
			map.put(c, map.getOrDefault(c,0)+ 1);
		}
		 for (int i = 0; i < wordChar.length; i++) {
			if(map.get(wordChar[i]) == 1)return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Ex02IndexOfFirstNonRepeatingCharOfAString x = new Ex02IndexOfFirstNonRepeatingCharOfAString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a string:");
		String wordString = scanner.next();
		System.out.println(x.indexOfChar(wordString));
		
		
		
	}
}
