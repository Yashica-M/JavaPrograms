
package programs;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int n, i = 1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a = 0, b = 1;
		System.out.println(a + " " + b);
		while (i <= n) {
			int c = a + b;
			System.out.println(c + " ");
			a = b;
			b = c;
			i++;
		}
	}
}