package selfPractice;
import java.util.*;

public class SmartTrackerApp {
	
	public static double average(int[]arr) {
		// average of weekly temperature
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return (double) sum / arr.length;
	}
	
	public static String HotCold(int[]arr) {
		// identify hottest and lowest
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return "Highest Temperature Recorded : " + max + "\nLowest Temperature : " + min;
	}
	
	public static int CountHot(int[]arr) {
		// Count how many days the temperature was above 30°C
		int count = 0;
		for(int i = 0; i <arr.length; i++) {
			if(arr[i] > 30) {
				count ++; 
			}
		}
		return count;
	}
	public static String totalAndAvgSale(int[]arr) {
		// Calculate total revenue and average daily sales using array traversal.
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		double avg = sum / arr.length;
		
		return " Total Revenue --> " + sum + " \nAverage Sales -->  " + avg;
	}
	
	public static String highLowSalesOfWeek(int[]arr) {
		// Identify the highest and lowest sales of the week and the days they occurred.
		int high = arr[0];
		int low = arr[0];
		int day_high = 0;
		int day_low = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(high < arr[i]) {
				high = arr[i];
				day_high = i + 1;
			}
			if(low > arr[i]) {
				low = arr[i];
				day_low = i + 1;
			}
		}
		return "Highest sale --> " + high + " on Day : " + day_high + "\nLowest sale  --> " + low + " on Day : " +  day_low;

	}
	
	public static String salesAbove(int[]arr) {
		//Find out how many days had sales above ₹100.
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
				if(arr[i] > 100) {
					count++;
				}
		}
		return "The number of days sales above 100 are --> " + count;
	}
	public static String specificSale(int[]arr) {
		// Search the array for a specific sale amount (for example, ₹150).
		// If found, print which day it occurred.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the specific sale amount to search  -->  ");
		int searchAmount = sc.nextInt();
		int day = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == searchAmount) {
				day = i + 1;
				return "The sale amount of " + searchAmount + " day has been founnd that is on  day -->  " + day;
			}
		}
		return "No result! ";
	}
	public static int updateSales(int[]arr) {
		// Suppose the shop owner updated the sales for Day 2 to ₹95.
		// Update the array and display the new value.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day to change value like 1, 2, ,3 ... --->   ");
		int day = sc.nextInt();
		System.out.print("Update the value -->  ");
		int value = sc.nextInt();
		
		for(int i = 0; i < arr.length; i ++) {
			if(i == day) {
				arr[i] = value;
			}
		}
		for(int i = 0; i < arr.length; i ++) {
			System.out.println(arr[i] + " ");
		}
		
		return 0;
	}
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] sales = {120, 80, 150, 90, 200, 75, 110};
		int [] temp = {32, 28, 31, 29, 35, 27, 30};
		
		double avg = average(temp);
		System.out.printf("Average of the temperatur of whole week is -->  %.2f\n",  avg);
		
		System.out.println(HotCold(temp));
		
		//int hotDays = CountHot(temp);
		System.out.println("Number of hottest days in the week are -->  " + CountHot(temp));
		
		System.out.println(totalAndAvgSale(sales));
		
		System.out.println(highLowSalesOfWeek(sales));
		
		System.out.println(salesAbove(sales));
		
		System.out.println(specificSale(sales));
		
		
		
		
		sc.close();
	}

}
