package java_task4;

import java.util.Scanner;

public class Swapnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
        System.out.println("Before swap : ");

        System.out.print("Enter the Number A : ");
        int a = myObj.nextInt();

        System.out.print("Enter the Number B : ");
        int b = myObj.nextInt();

        // Swapping a & b

        int temp = a;
        a = b;
        b = temp;

        // After Swap
        System.out.println("After swap : ");

        System.out.println("Enter the Number x : " + a);
        // int x = myObj.nextInt();

        System.out.println("Enter the Number y : " + b);
        // int y = myObj.nextInt();

	}

}
