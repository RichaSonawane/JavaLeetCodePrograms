package basics;

public class DuplicateString {

	public static void main(String[] args) {
		String str = "TestingAutomation";
		char[] ch = str.toLowerCase().toCharArray();
		int count = 0;
		
		for(int i = 0;i<ch.length; i++) {
			if(ch[i]=='0') {
				continue;
			}
			for(int j= i+1; j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					
					System.out.println("Duplicate character in string :"+ ch[j]);
					ch[j]='0';
					count++;
				}
			}
		}
		System.out.println("duplicate character count"+ count);
		System.out.println("string: "+ str);
		System.out.println("string 2: "+ String.valueOf(ch));
	}

}
