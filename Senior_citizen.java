package java_task4;

import java.util.Scanner;

public class Senior_citizen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Age : ");
        int age = scanner.nextInt();

        if (age < 25) {
            System.out.println("I'm an child");
        }

        else if (age > 25) {
            System.out.println("I'm an Adult");
        } else {
            System.out.println("I'm an Senior Citizen");
        }
	}

}
