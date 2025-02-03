package practice;

import java.util.Scanner;

public class function_multiplication {

	public static int multiplication(int a, int b, int c) {
		int multiplication = a * b * c;
		return multiplication;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int multiplication = multiplication(a, b, c);
		System.out.println(multiplication);

	}
}
