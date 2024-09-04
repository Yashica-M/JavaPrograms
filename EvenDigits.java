package programs;

import java.util.Scanner;

public class EvenDigits {
	public static void main(String[] args) {
	int n,rev=0,rem=0,digitsCount=0; 
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int temp = n;
	while (temp > 0) {
		temp = temp/10;
		digitsCount++;
	}
	while(n>0) {
		 rem=n/(int)Math.pow(10, digitsCount-1);
		if(rem%2==0) {
			System.out.println(rem);
		}
		n=n%(int)Math.pow(10, digitsCount-1);
		digitsCount--;
	}
}
}
