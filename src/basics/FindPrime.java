package basics;

public class FindPrime {

	public static void main(String[] args) {
		
		findPrimeNo(7);
	}
	public static void findPrimeNo(int num) {
		int flag=0;
		if(num==0 || num==1) {
			System.out.println("not a prime numbers");
		}
		int middleNum = num/2;
		for(int i =2; i <=middleNum;i++) {
			if(num%i == 0) {
				flag=1;
				System.out.println("number is not a prime number");
					break;
			}
		}
		if(flag == 0) {
			System.out.println("pm");
		}
	
	}

}
