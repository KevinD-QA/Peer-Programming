package Main;

import java.util.Scanner;

public class TaskOne {


	public static void taskOne() {
		
		Scanner num = new Scanner(System.in);
		int num1 = Integer.parseInt(num.nextLine());
		int k =num1;

		for (int i = 2;k != i; i++) {
			 k = k/i;
			}
		if (k == 0) {
				System.out.println("None");
			} else {
				System.out.println("Reverse Factorial of "  + num1 + " is " + k + "!");
			}
		}
	
}