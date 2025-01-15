package java_task4;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for factorial :  ");
        int num = scanner.nextInt();
        long factorial = 1;
  
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + num + " is " + factorial);
	}
}

/*
 * Output:
 * Enter the number for factorial :  5
   Factorial of 5 is 120
 */
