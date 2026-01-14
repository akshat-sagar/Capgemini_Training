package class_13_01_26_StringPrograms_Practice;

public class DuplicateCharInString {

	public static void main(String[] args) {

		// duplicate in string
		
		String str = "Hello";
		char[] s1 = str.toCharArray();
		
		for(int i = 0; i <s1.length; i++) {
			if(s1[i]==' ') 
				continue;
		
			int count=1;
			for(int j = i + 1; j < s1.length; j++) {
				if(s1[i] == s1[j]) {
					count++;
					s1[j]='0';
				}
			}
			
			if (count > 1 && s1[i] != '0') {
                System.out.println(s1[i]+" -> "+count);
            }
		}
		//System.out.println(count);
		
		
		}
		
	}

