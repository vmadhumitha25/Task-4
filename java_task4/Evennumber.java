package java_task4;

import java.util.Scanner;

public class Evennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the Number : ");

        int number = myObj.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
	}
}

/*
 * Output:
 * Enter the Number : 68
   The number is Even
 */
