package basics;

import java.util.Scanner;

public class sumOfNumbers {

	public static void main(String[] args) {
		int num1, num2;
		System.out.println("enter num1");
		Scanner sc= new Scanner(System.in);
		num1 = sc.nextInt();
		System.out.println("enter num2");
		num2 = sc.nextInt();
		System.out.println("sum:"+ (num1+num2));

//		//calculate average
//		System.out.println("enter numbers");
//		int count = sc.nextInt();
//		int number, sum=0;
//		float average=0;
//		for(int i=0; i<count;i++) {
//			number=sc.nextInt();
//			sum=sum+number;
//		
//		}
//		average=sum/count;
		
		int[] arr= {1,2,3,4,5};
		int res=0;
		for(int i=0; i<arr.length;i++) {
			res = res + arr[i];
		}
		System.out.println(res);
		
		
		
	}

}
