package programs;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int n, digitsCount = 0, num = 0, rem = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int temp = n;
		while (temp > 0) {
			temp = temp/10;
			digitsCount++;
		}
		temp = n;
		rem = 0;
		while (temp > 0) {
			rem = temp % 10;
			num += Math.pow(rem, digitsCount);
			temp /= 10;
		}
		if(num==n) {
			System.out.println(n+" is an Armstrong Number");
		}
		else {
			System.out.println(n+" is not an Armstrong Number");
		}
	}
}

