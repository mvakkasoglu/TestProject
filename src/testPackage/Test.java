package testPackage;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
	
	String lastName = "Vakkasoglu";
	String character = "";
	char[] newChar = lastName.toCharArray();
	List<String> list = new ArrayList<String>();
	for(int i = 0; i<newChar.length; i ++) {
		list.add((character + newChar[i]).toUpperCase());
		
		
	}
	System.out.println(list.toString());
	
	
	
	
	}

}
