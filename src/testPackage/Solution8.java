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

public class Solution8 {
	public static void main(String[] args) {
		String S = "20181115 15:01:01 - Doing something\n"
				 + "20181115 15:01:01 - Doing something else\n"
				 + "20181115 15:01:02 - EXCEPTION: SillyUnexpectedException\n"
				 + "20181115 15:01:03 - ERROR: Oops!\n"
				 + "20181115 15:01:04 - Giving up\n"
				 + "20181115 15:01:05 - RESULT: TEST FAILED";
		System.out.println((new Solution8()).solution(S));
	}
	/**
	 * Tags used flag important log messages.
	 **/
	 
	 
	 enum Tag{
		 EXCEPTION,
		 ERROR,
		 RESULT
		 //fill in with necessary details -- Completeing this is optional but bonus if you use this correctly!
		 
	 }
	 /**
	  * Encapsulates important log messages for further processing.
	  **/
	 class Important{
		 private String logMsg;
		 private Tag tag;
		 Important(String logMsg, Tag tag){
			this.logMsg = logMsg;
			this.tag = tag;
		 }
		 
		 
		 public String toString() {
			 return tag.name() + " found: " + logMsg;
		 }
		 	 
	 }
	 
	 public Solution8() {
		 // add necessary stuff here
	 }
	 private List<Important> highlights = new ArrayList<>();
	 public String solution(String log) {
		 String logMsg [] = log.split("\n");
		 Tag tag [] = Solution8.Tag.values();
		 for(String eachLog : logMsg) {
			 for(Tag t : tag) {
				 if(eachLog.contains(t.name())) {
					 highlights.add(new Important(eachLog, t));
				 }
			 }
		 }
		 
		 // write your code in Java
	 
	 
	 ///// DO NOT CHANGE THE CODE BELOW /////
	 return formatResults();
	 }
	 
	 ///// DO NOT CHANGE THE CODE BELOW /////
	 private String formatResults() {
		 String results = "{";
		 for(Important item : highlights) {
			 results += "'" + item + "',";
		 }
		 results += "}";
		 return results;
	 }
	 
 

}
