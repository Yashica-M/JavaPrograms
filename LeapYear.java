package programs;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n % 4 == 0) {
			if(n%100==0) {
				if(n%400==0) {
				System.out.println(n+" is a leap year");
			}
			else {
				System.out.println(n+" is not a leap year");
			}
		}
			else {
				System.out.println(n+" is a leap year");
			}
		}
		else {
			System.out.println(n+" is not a leap year");
		}
	}
}
              
