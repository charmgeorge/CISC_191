//(Compute greatest common divisor using recursion)
//
//The gcd(m, n) can also be defined recursively as follows:
//
//- If m % n is 0, gcd(m, n) is n.
//- Otherwise, gcd(m, n) is gcd(n, m % n).
//
//Write a recursive method to find the GCD. Write a test program that prompts the user to enter two integers and displays their GCD.
//
//﻿Sample Run
//﻿
//Enter the first number: 3
//
//Enter the second number: 7
//
//The GCD of 3 and 7 is 1

package exercise_18_02;

import java.util.Scanner;

public class Exercise_18_02 {
	public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            int m = Integer.parseInt(input.next());
            System.out.print("Enter the second number: ");
            int n = Integer.parseInt(input.next());

            // Calucate and display the GCD
            System.out.println("TThe GCD of " + m + " and " + n
                    + " is " + gcd(m, n));
	}

	/** Calculating the GCD */
	private static int gcd(int m, int n) {
		if (m % n == 0)
			return n; // Base case
		else // Recursive call
			return gcd(n, m % n);
	}
}
