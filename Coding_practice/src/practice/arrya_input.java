package practice;

import java.util.Scanner;

public class arrya_input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int number[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println(number[i]);
		}
	}

}
