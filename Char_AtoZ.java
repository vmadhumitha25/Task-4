

import java.util.Scanner;

public class Char_AtoZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Press Enter to print A to Z character : ");
	        scanner.nextLine();
	        for (char ch = 'A'; ch <= 'Z'; ch++) {
	            // System.out.println(ch.toUpperCase());
	            System.out.println(ch + "   ");
	        }
	        scanner.close();
	}

}
