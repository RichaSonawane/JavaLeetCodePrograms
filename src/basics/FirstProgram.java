package basics;

public class FirstProgram {

//  Write a Java program to add two strings:
	public String joinString(String ab, String cd) {
		return ab + cd;
	}
// 2. Write a Java program to print the sum of two numbers.
		public int add(int a, int b) {
			return a+b;
		}

		//Write a Java program to print the division of two numbers.
		public float divisionOftwo(int a, int b) {
			return a/b;
		}
		// Try to concat "Hello Selenium" with a character 't'.
public String appendT(String c) {
	return c+"t";
}
	public static void main(String[] args) {

		FirstProgram fp = new FirstProgram();
		String result = fp.joinString("Richa", " Sonawane");
		System.out.println(result);
		System.out.println(fp.add(5, 10));
		System.out.println(fp.appendT("Richa"));
		System.out.println((int)'h');
		

	}

}
