package class_30_12_25_userName_passWord;

 public class MainApp {

	public static void main(String[] args) {
		//package ke class name ke uper rhga ye
		Security u1 = new Security();
		
		u1.setUserName("akshat");
		System.out.println(u1.getUserName());

		u1.setPass("akshat@123");
		System.out.println(u1.getPass());
	}

}
