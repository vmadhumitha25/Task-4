package java_task4;

import java.util.Scanner;

public class String_10times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // String msg = "Welcome to Guvi";
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Message : ");
        String msg = obj.nextLine();

        for (int i = 0; i <= 10; i++) {
            System.out.println(msg);
        }

	}

}

/*
 * Output:
 * Enter the Message : Welcome to Guvi
Welcome to Guvi
Welcome to Guvi
Welcome to Guvi
Welcome to Guvi
Welcome to Guvi
Welcome to Guvi
Welcome to Guvi
Welcome to Guvi
Welcome to Guvi
Welcome to Guvi
Welcome to Guvi
 */

