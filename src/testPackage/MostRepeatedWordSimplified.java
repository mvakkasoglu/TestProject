package testPackage;

import java.util.HashMap;

public class MostRepeatedWordSimplified {
	public static void main(String[] args) {
		
		String testString = "Lorem Ipsum is simply dummy text of the " +
        		"printing and typesetting industry. Lorem Ipsum has been " +
        		"the industry's standard dummy text ever since the 1500s, " +
        		"when an unknown printer took a galley of type and scrambled " +
        		"it to make a type specimen book. It has survived not only " +
        		"five centuries, but also the leap into electronic typesetting, " +
        		"remaining essentially unchanged. It was popularised in the " +
        		"1960s with the release of Letraset sheets containing " +
        		"Lorem Ipsum passages, and more recently with desktop " +
        		"publishing software like Aldus PageMaker including " +
        		"versions of Lorem Ipsum.";
        findMostRepeatedWord(testString);
		
	}
	public static String findMostRepeatedWord(String s) {
		String[] words = s.toLowerCase().trim().split("\\s+");
		HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
		
		//create the HashMap
		for(String word : words) {
			if(wordCountMap.containsKey(word)) {
				wordCountMap.put(word, wordCountMap.get(word)+1);
			} else {
				wordCountMap.put(word, 1);
			}
		}
		//iterate through the keyset to find the most repeated word
			String mostRepeatedWord = "";
			int max = 0;
			for(String key : wordCountMap.keySet()) {
				if(max<wordCountMap.get(key)) {
					max = wordCountMap.get(key);
					mostRepeatedWord = key;
				}
				
			}
			System.out.println("Most repeated word: " + mostRepeatedWord + "\nRepeated: " + max + " times");
			return mostRepeatedWord;
	}

}
