package java_task4;

import java.util.Scanner;

public class Swapnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
        System.out.println("BEFORE SWAP");

        System.out.print("Enter the Number A : ");
        int a = myObj.nextInt();

        System.out.print("Enter the Number B : ");
        int b = myObj.nextInt();

        // Swapping a & b

        int temp = a;
        a = b;
        b = temp;

        // After Swap
        System.out.println("AFTER SWAP");

        System.out.println("Enter the Number x : " + a);
        // int x = myObj.nextInt();

        System.out.println("Enter the Number y : " + b);
        // int y = myObj.nextInt();

	}
}


/*
 * Output:
BEFORE SWAP
Enter the Number A : 5
Enter the Number B : 4
AFTER SWAP
Enter the Number x : 4
Enter the Number y : 5
*/