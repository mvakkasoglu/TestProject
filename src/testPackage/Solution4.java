package testPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution4 {
	List<Important> highlights = new ArrayList<>();

	  public static void main(String[] args) {

	    String s =
	        "20181115 15:01:01 - Doing something\n"
	            + " 20181115 15:01:01 - Doing something else\n"
	            + " 20181115 15:01:02 - EXCEPTION: SillyUnexpectedException\n"
	            + " 20181115 15:01:03 - ERROR: Oops!\n"
	            + " 20181115 15:01:04 - Giving up\n"
	            + " 20181115 15:01:05 - RESULT: TEST FAILED";

	    Solution4 s1 = new Solution4();
	    System.out.println(s1.solution(s));
	  }

	  public String solution(String log) {
	    List<String> logMsg = new ArrayList<>(Arrays.asList(log.split("\n")));
	    logMsg.stream()
	        .forEach(eachLog -> Arrays.stream(Tag.values())
	            .forEach(tags -> { if (eachLog.contains(tags.name())) highlights.add(new Important(eachLog, tags));
	            }));
	    return formatResults();
	  }

	  private String formatResults() {
	    String results = "{";
	    for (Important item : highlights) {
	      results += "" + item + ",";
	    }
	    results += "}";
	    return results;
	  }
	}

	class Important {
	  private String logMsg;
	  private Tag tag;

	  public Important(String logMsg, Tag tag) {
	    this.logMsg = logMsg;
	    this.tag = tag;
	  }

	  public String toString() {
	    return tag.name() + " found:" + logMsg;
	  }
	}

	enum Tag {
	  EXCEPTION,
	  ERROR,
	  RESULT;
	}


