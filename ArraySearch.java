package programs;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
		int n=0, i = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int []a=new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			}
		System.out.println("Enter the element to be searched: ");
		int key=sc.nextInt();
		for(i=0;i<n;i++) {
			if(key==a[i]) {
				System.out.println("The element "+key+" is found in the array in the index "+i);
				return;
			}
		}
		System.out.println("The element "+key+" is not found" );
	}
}
