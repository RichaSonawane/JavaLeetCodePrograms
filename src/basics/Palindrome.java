package basics;

public class Palindrome {

	public static void main(String[] args) {
//		int num =1251;
//		int temp = num;
//		int revNum=0;
//		while(temp>0) {
//			int lastDigit = temp%10;
//			revNum = revNum*10 + lastDigit;
//			//int sum = sum+lastDigit
//			temp = temp/10;
//		}
//		if(num==revNum) {
//			System.out.println("number is palindrome");
//		}
//		else {
//			System.out.println("number is not a palindrome");
//		}
		String org = "MADAM";
		String temp =org;
		String rev ="";
		for(int i =0; i< temp.length();i++) {
			 rev = temp.charAt(i)+rev;
		}
		if(org.equals(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}
	
			

}
