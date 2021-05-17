package Main;

import java.util.Scanner;

public class TaskTwo {
	
	public static void TaskTwo() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Placement of pup:");
		int placement = Integer.parseInt(scanner.nextLine());
		int s = 8;
		
		System.out.println("Your pup finished " + placement);
		for (int i = 1; i < placement; i++) {
			String output = String.valueOf(i);
			if (output.endsWith("1")) {
				System.out.println(output + "st");
			} else if (output.endsWith("2")) {
				System.out.println(output + "nd");
			} else if (output.endsWith("3")) {
				System.out.println(output + "rd");
			} else {
				System.out.println(output + "th");
			}
		}
		
		for (int k = placement + 1; k <= 100; k++) {
			String output = String.valueOf(k);
			if (output.endsWith("1")) {
				System.out.println(output + "st");
			} else if (output.endsWith("2")) {
				System.out.println(output + "nd");
			} else if (output.endsWith("3")) {
				System.out.println(output + "rd");
			} else {
				System.out.println(output + "th");
			}
		}
	}
}
