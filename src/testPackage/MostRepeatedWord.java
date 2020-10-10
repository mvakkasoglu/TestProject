package testPackage;

import java.util.Arrays;
import java.util.HashMap;

public class MostRepeatedWord {

	public static String findMostRepeatedWord(String s) {
		// Create a hashmap to keep track of how often we have seen each word
		HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
		// Normalize input
		String lowercased = s.toLowerCase().trim();
		String[] words = lowercased.split("[ \\n\\t\\r.,;:!?()]"); 
//		String[] words = lowercased.split("\\s+");
		// See what the words are
		System.out.println(Arrays.toString(words));
		System.out.println("word count of the text: " + words.length);
		
		//iterate through the words array -->
		//count how many times we've seen each word
		for(String word : words) {
			//takes away spaces
			if (word.length() > 0) {
				if (wordCountMap.containsKey(word) && !isCommonWord(word)) {
					//if it exist in the hashmap, increment by 1
					wordCountMap.put(word, wordCountMap.get(word) + 1);
				} else {
					//if it doesn't exist, put it in with the value 1.
					wordCountMap.put(word, 1);
				}
			}
		}
		// Iterate through the wordCountMap to find out which word was repeated the most and how many times.
        int max = 0;
        String mostRepeatedWord = "";
        for (String key : wordCountMap.keySet()) {
            int currentValue = wordCountMap.get(key);
            if (currentValue > max) {
                mostRepeatedWord = key;
                max = currentValue;
            }
        }

        System.out.println("Most repeated word: " + mostRepeatedWord + "\nRepeated: " + max + " times");

        return mostRepeatedWord;
    }
	// Is the word a common word?
    public static boolean isCommonWord(String item) {
        String[] commonWords = {"the", "a", "or", "an", "it", "and", "but", "is", "are", "of", "on", "to", "was", "were", "in", "that", "i", "your", "his", "their", "her", "you", "me", "all"};
        for (String s : commonWords) {
            if (s.equals(item)) {
                return true;
            }
        }
        return false;
    }

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
        
        System.out.println();
        
		String s = "Lorem Ipsum is simply dummied text of the printing and typesetting industry. "
				+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s "
				+ "when an unknown printer took a galley of type and scrambled it to make a type specimen book.";
		findMostRepeatedWord(s);
	}

}
