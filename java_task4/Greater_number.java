package java_task4;

import java.util.Scanner;

public class Greater_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Integer a : ");
        int a = scanner.nextInt();
        System.out.print("Enter the Integer b : ");
        int b = scanner.nextInt();
        System.out.print("Enter the Integer c : ");
        int c = scanner.nextInt();
        System.out.print("Enter the Integer d : ");
        int d = scanner.nextInt();

        int sum1 = a + b;
        int sum2 = c + d;

        System.out.println(sum1);
        System.out.println(sum2);

        if (sum1 > sum2) {
            System.out.println("Sum of a and b is Greater than Sum of c and d");
        } else {
            System.out.println("Sum of a and b is Lesser than Sum of c and d");
        }

	}

}

/*
 * Output: 
 * Enter the Integer a : 4
Enter the Integer b : 5
Enter the Integer c : 6
Enter the Integer d : 8
9
14
Sum of a and b is Lesser than Sum of c and d
 */
