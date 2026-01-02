package class_24_12_25;

public class Program_Odd_INdexed_elemets {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,8,10,15};
		
		for(int i = 0; i<arr.length; i++) {
			if(i % 2 != 0) {
				System.out.println(arr[i]);
			}
		}

	}

}
