package java_task4;

import java.util.Scanner;

public class Count_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        Long num = obj.nextLong();
        int count = 0;

        // for (int i = 0; num > 1; num /= 10, count++);
        while (num != 0) {
            num /= 10;
            count++;
        }

        System.out.println("Number of digits : " + count);
	}
}

/*
 * Output:
 * Enter the Number : 546
   Number of digits : 3
 */
