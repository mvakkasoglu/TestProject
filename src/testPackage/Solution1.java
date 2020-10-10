package testPackage;

/* write a function that prints out ASCII-art in the shape of the capital letter L, 
 * made up of copies of the letter L. Parameter N is an integer 
 * (between 1 and 100) and represents the expected size of the ASCII-art (the output should comprise N rows, 
 * the last of which should comprise N letters L)
 * For example, here is the output for N = 4
 * L
 * L
 * L
 * LLLL
 * 
 * the function should not return any value.
 * 
 * You can print a string to the output ( without or with the end-of-line character) as follows:
 * System.out.print("sample string");
 * System.out.prinln("whole line")*/

public class Solution1 {
	public static void main(String[] args) {
		solution(4);
	}
	
	public static void solution(int N) {
		for(int i=0; i<N-1; i++ ) {
			System.out.println("L");
		}
		for(int j=0; j<N; j++) {
			System.out.print("L");
		}
	}

}
