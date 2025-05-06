package basics;

public class StringReversal {

	public static void main(String[] args) {
		stringReversal("abc programming");

	}
	public static void stringReversal(String str) {
	String rev="";
	char ch;
	for(int i =0; i< str.length();i++) {
		rev = str.charAt(i)+rev;
	}
		System.out.println(rev);
	}

}
