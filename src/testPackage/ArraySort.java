package testPackage;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int [] array = {2,1,5,4,3};
		System.out.println(Arrays.toString(arraySortMethod(array)));
		
	}
	
	
	public static int[] arraySortMethod(int[] array) {
		
		
		int temp = 0;
		for(int i = 0; i<array.length; i++) {
			for(int j = i+1; j<array.length; j++) {
			if(array[i]>array[j]) {
				temp = array[i];    
                array[i] = array[j];    
                array[j] = temp; 
				
			}
			
			}
		
	}
return array;

}
}