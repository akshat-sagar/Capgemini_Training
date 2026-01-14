package class_13_01_26_StringPrograms_Practice;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// COUNT VOWELS - A E I O U
		
		// 
		
		String s1 = "Hello My name is Akshat";
		String str = s1.toLowerCase();
		
		int v_count = 0;
		int c_count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u') {
				v_count++;
			
			}else if(ch >= 'a' && ch  <= 'z') {
				c_count++;
			}
			
		}
		System.out.println(v_count);
		System.out.println(c_count);
		

	}

}
