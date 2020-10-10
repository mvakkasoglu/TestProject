package testPackage;


import java.util.Arrays;
import java.util.HashMap;


public class MostRepeatedChar {
	public static void main(String[] args) {
		String testString = "nndmekkrkttsajhjaklql3nbb6nl28897nnm";
		mostRepeatedChar(testString);
		
		
	}
	
	static Character mostRepeatedChar;
	public static Character mostRepeatedChar(String s) {
		
		
		int max = 0;
//		String[] array = {"a", "b", "c"};
//		System.out.println(Arrays.toString(array));
		char[] character = s.toLowerCase().trim().toCharArray();

		System.out.println(Arrays.toString(character));
//		List<String> list = new ArrayList<String>();
//		for(char ch : character) {
//			list.add("" + ch);
//		}
//		System.out.println(list.toString());
		System.out.println(character.length);
		
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		for(char ch : character) {
			if(charCountMap.containsKey(ch)) {
				charCountMap.put(ch, charCountMap.get(ch)+1);
			} else {
				charCountMap.put(ch,1);
			}
		}
		
		for (Character key : charCountMap.keySet()) {
			int currentValue = charCountMap.get(key);
			if(currentValue>max) {
				mostRepeatedChar = key;
				max = currentValue;
			}
		}
		
	
		System.out.println("Most repeated char: " + mostRepeatedChar + "\nRepeated: " + max + " times");

        return mostRepeatedChar;
		
		
		

}
}
