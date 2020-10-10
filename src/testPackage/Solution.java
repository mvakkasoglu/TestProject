package testPackage;

import java.util.ArrayList;


//import testPackage.Solution.Important;

/* The key goal is to write a function:
 * class Solution { public String solution(String S);}
 * that given a string S (which are the contents of a log file), returns a string that contains a formatted summary of the most
 * important information from the log. There is also supporting code the you will need to construct.
 * c
 * Log file format:
 * - The entire log file contents will be passed to your function as a single String.
 * - Each line, except maybe the last line, is terminated by '\n'.
 * - Each line has the general format: "DATE TIME - TAG: DETAILS" (but lines may have all or none of these).
 * 
 * Important information that we want reported from the log are marked with the following tags:
 * - EXCEPTION
 * - ERROR
 * - RESULT
 * 
 *   Each Important item must be represented in the output with a string that is formatted like this: "TAG found: LOG_MESSAGE_TEXT"
 *   
 *   Additionally, to successfully complete this task, you must also build out a bit of object oriented code to encapsulate some details.
 *   For example:
 *   - Each important log item must be encapsulated within the nested 'Important' class.
 *   - OPTIONAL: The Important types of messages need to be tagged with the Tag enum.
 *   - Follow any guidance that is provided in the comments in the initial code.
 *   
 *   Example Input & Output
 *   For example, if the log file contains the following:
 *   
 *   20181115 15:01:01 - Doing something
 *   20181115 15:01:01 - Doing something else
 *   20181115 15:01:02 - EXCEPTION: SillyUnexpectedException
 *   20181115 15:01:03 - ERROR: Oops!
 *   20181115 15:01:04 - Giving up
 *   20181115 15:01:05 - RESULT: TEST FAILED
 *   
 *   Then the Important.solution() method's output must look exactly like this:
 *   {'EXCEPTION found: 20181115 15:01:02 - EXCEPTION: SillyUnexpectedException','ERROR found: 20181115 15:01:03 - ERROR: Oops!',
 *   'RESULT found: 20181115 15:01:05 - RESULT: TEST FAILED',}
 */

public class Solution {

	/**
	 * Tags used flag important log messages.
	 **/

	enum Tag {
		// fill in with necessary details -- Completing this is optional but bonus if
		// you use this correctly!
		EXCEPTION, ERROR, RESULT
	}

	/**
	 * Encapsulates important log messages for further processing.
	 **/

	public static void main(String[] args) {
		String string = "20181115 15:01:01 - Doing something" + "\n" + "20181115 15:01:01 - Doing something else" + "\n"
				+ "20181115 15:01:02 - EXCEPTION: SillyUnexpectedException" + "\n" + "20181115 15:01:03 - ERROR: Oops!"
				+ "\n" + "20181115 15:01:04 - Giving up" + "\n" + "20181115 15:01:05 - RESULT: TEST FAILED";
//		  Solution slt = new Solution();
//		 String string1 = slt.solution(string);
		String string1 = new Solution().solution(string);
		System.out.println(string1);
//		 System.out.println(Arrays.toString(Solution.Tag.values()));
	}

	class Important { // inner class of Solution
		private String results;

		Important(String results) { // constructor of inner class Imposrtant
			this.results = results;
		}

		public String toString() { // overridden toString(java.lang.Object.toString) method
			return results;
		}

	}

	public Solution() {
		// add necessary stuff here
	}

	private ArrayList<Important> highlights = new ArrayList<>();

	public String solution(String log) {
		// write your code in Java
		String output = "";
		String array[] = log.split("\n"); // log.split("\n") returns an array of strings

//		 System.out.println(Arrays.toString(array));
//       array [] = [20181115 15:01:01 - Doing something, 20181115 15:01:01 - Doing something else, 20181115 15:01:02 - EXCEPTION: SillyUnexpectedException, 20181115 15:01:03 - ERROR: Oops!, 20181115 15:01:04 - Giving up, 20181115 15:01:05 - RESULT: TEST FAILED]

		for (String str : array) {
			for (Solution.Tag t : Solution.Tag.values()) { // Solution.Tag.Values() returns values of enum as array --
															// [EXCEPTION, ERROR, RESULT]
				if (str.contains(t.name())) {
//				 System.out.println(t.name());  //t.name returns elements of the array (Solution.Tag.Values) as string
					output += t.name() + " found:" + str;
					Important imp = new Important(output);
					highlights.add(imp); // using inner class Important as a security mechanism
					output = "";

				}
			}
		}

		///// DO NOT CHANGE THE CODE BELOW /////
		return formatResults();
	}

	///// DO NOT CHANGE THE CODE BELOW /////
	private String formatResults() {
		String results = "{";
		for (Important item : highlights) {
			results += "'" + item + "',";
		}
		results += "}";
		return results;
	}
}