package basics;

import java.util.Scanner;

public class addDigits {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum=0;
		while(number>0) {
			int lastDigit =number%10;
			number = number/10;
			sum= sum+ lastDigit;
		}
		System.out.println("sum:"+ sum);
		
		//sum of number in array
		
		int[] arr= {1,2,3,4,5};
		int arrlength = arr.length;
		
		
	}

}
