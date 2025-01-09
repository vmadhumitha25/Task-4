package java_task4;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for factorial :  ");
        int num = scanner.nextInt();
        // long factorial = 1;
        int n, factorial = 1;
        // while (n <= num) {
        // factorial = factorial * x;
        // n++;
        // }
        for (int i = 1; i <= num; ++num) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + num + " is " + factorial);

	}

}
