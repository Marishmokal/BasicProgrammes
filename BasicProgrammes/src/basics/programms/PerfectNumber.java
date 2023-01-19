package basics.programms;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println();
		int num = s.nextInt();
		for (i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (num == sum) {
			System.out.println("perfect number");
		} else
			System.out.println("not perfect number");
	}
}
