package java_task4;

import java.util.Scanner;

public class Length_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String msg = "Guvi Geek";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Message :  ");
        String msg = scanner.nextLine();
        System.out.println("Length of Msg is : " + msg.length());
        scanner.close();
	}

}

/*
Output:
Enter the Message :  Guvi Geek
Length of Msg is : 9
*/