package testPackage;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
	public static void main(String[] args) {
		System.out.println("test");
		List<Integer> elements = new ArrayList<>();
		elements.add(10);
		int firstElement = elements.get(0);
		System.out.println(firstElement);
	}

}