package class_24_12_25;

public class Program_Print_Positive_Even_Element_inArray {

	public static void main(String[] args) {


		int arr[] = {1, -2, 3, 4, -5, 6, 7, 8, -9, 10};
		// print which are positive and even
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > 0 && arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}

		
	}

}
