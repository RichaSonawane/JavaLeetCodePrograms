package basics;

public class StarPattern {

	public static void main(String[] args) {
		int num =5;
//		for(int i=0; i<num; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		for(int i=0; i<num; i++) {
			for(int e=0; e<i-1;e++) {
				System.out.print(" ");
			}
			for(int s =0; s<=i;s++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
