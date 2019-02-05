package input;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		System.out.println("Please enter a number: ");
		Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        sc.close();
        int result = input1 + input2;
        System.out.println("Total addition of two inputs: " + result);
	}

}
