package class_14_01_26_Exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2 ,3, 4, 5};
		try {System.out.println(arr[6]);
	}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

