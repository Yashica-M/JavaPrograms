package programs;

import java.util.Scanner;

public class PrimeorNot {
	public static void main(String[] args) {
		int n, flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		if (n <= 1) {
			flag = 1;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					flag = 1;
					break;
				}
			}
		}
		if (flag == 0) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}
}
