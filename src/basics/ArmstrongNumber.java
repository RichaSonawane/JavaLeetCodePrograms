package basics;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//ArmStrong Number example
		//1^1=1 so armstrong num
		//153 = 1^3 + 5^3 + 3^3= 153 hence armstrong
		
		System.out.println("enter number:");
		Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			IsArmstrongNum(num);
			
		
	}
	public static boolean IsArmstrongNum(int i) {
		int temp = i;
		int digit=0;
		while(temp>0) {
			temp = temp/10;
			digit++;
		}
		System.out.println("number of digits:"+ digit);
		temp=i;
		int sum =0;
		while(temp>0) {
			int lastDigit = temp%10;
			 sum = (int) (sum +Math.pow(lastDigit, digit));
			temp = temp/10;
		}
		System.out.println("sum: "+sum);
		if(i==sum) 
		{
			System.out.println("Armstrong number");
			return true;
			
		}else {
			System.out.println("not a Armstrong number");
			return false;
		}
	}
}
