package testPackage;

import java.util.ArrayList;
import java.util.List;

/* The key goal is to write a funtion:
 * class Solution { public String solution(String S);}
 * that given a string S (which are the contents of a log file), returns a string that contains a formatted summary of the most
 * important information from the log. There is also supporting code the you will nedd to construct.
 * 
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
 *   Each important item must be represented in the output with a string that is formatted like this: "TAG found: LOG_MESSAGE_TEXT"
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

public class Solution5 {

	/**
	 * Tags used flag important log messages.
	 **/

	public static void main(String[] args) {
		String str = "20181115 15:01:01 - Doing something\n" + " 20181115 15:01:01 - Doing something else\n"
				+ " 20181115 15:01:02 - EXCEPTION: SillyUnexpectedException\n" + " 20181115 15:01:03 - ERROR: Oops!\n"
				+ " 20181115 15:01:04 - Giving up\n" + " 20181115 15:01:05 - RESULT: TEST FAILED";
		Solution5 sltn = new Solution5();
		System.out.println(sltn.solution(str)); // Solution method returns String

	}

	enum Tag {
		// fill in with necessary details -- Completeing this is optional but bonus if
		// you use this correctly!
		EXCEPTION, ERROR, RESULT
	}

	/**
	 * Encapsulates important log messages for further processing.
	 **/
	class Important {

		private String eachLog;
		private Tag tag;

		Important(String eachLog, Tag tag) {
			this.eachLog = eachLog;
			this.tag = tag;
		}

		public String toString() {
			return tag.name() + " found:" + eachLog;
		}

	}

	private List<Important> highlights = new ArrayList<>();

	public Solution5() {
		
		
		// add necessary stuff here
	}

	public String solution(String log) { // since solution() method is not static I need to create
		// an object of class Solution to call this method from main method.
		// write your code in Java

		String logMsg[] = log.split("\n");
		for (String eachLog : logMsg) {
			for (Solution5.Tag t : Solution5.Tag.values()) {
				if (eachLog.contains(t.name()))
					highlights.add(new Important(eachLog, t));

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