package programs;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while (n > 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}
		System.out.println(sum);
	}
}
