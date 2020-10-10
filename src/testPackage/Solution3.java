package testPackage;

	import java.util.*;
public class Solution3 {
	/*
	 * Click `Run` to execute the snippet below!
	 */

	

	/*
	 * write a program find the count of characters in a given string.
	 * Ex: aaabbfca
	 * a-->4
	 * 
	 */

	
	  public static void main(String[] args) {
		  String str = "aaabbfca";
		  method(str);
	 
	  }
		
	    
public static int method(String str) {
	
	List<String> list = new ArrayList<>();
	String str1="";
	    
	    for(int i=0; i<str.length(); i++) {
	    	list.add(str1+str.charAt(i));
	    	
	    }
	    return list.size();
	    	
	    
	   
	    }



	  
	}


