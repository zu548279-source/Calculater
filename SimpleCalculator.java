package com.if_else;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the first no");
		double a = sc.nextDouble();

		System.out.println("enter the second no");
		double b = sc.nextDouble();

		System.out.println("enter math operation (+,-,*,/) ");
		char ch = sc.next().charAt(0);

		if (ch == '+') {
			System.out.println("addition is: " + (a + b));
		}

		else if (ch == '-') {
			System.out.println("subtraction is: " + (a - b));
		}

		else if (ch == '*') {
			System.out.println("multiplication is: " + (a * b));
		}

		else if (ch == '/') {
			if (b != 0) {
				System.out.println("Division is: " + (a / b));
			} else {
				System.out.println("Division by zero is infinity/not possible");
			}
		} else {
			System.out.println("invalid math operator ");
		}

		sc.close();
	}

}
