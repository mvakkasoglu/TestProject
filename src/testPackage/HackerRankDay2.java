package testPackage;

import java.util.Scanner;

public class HackerRankDay2 {
 // Complete the solve function below.
	
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
    	double tip=0;
    	double tax=0;
        tip = (meal_cost * tip_percent/100);
        tax = (meal_cost*tax_percent/100);

        meal_cost = meal_cost + tip + tax;
        System.out.println((int)meal_cost);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
       

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }

}
