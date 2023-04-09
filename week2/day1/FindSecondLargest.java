package week2.day1;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		System.out.println("Original array was: " +Arrays.toString(data));
		Arrays.sort(data);
		System.out.println("Sorted array is: " +Arrays.toString(data));
		int secondLargestNumIndex = data.length-2;
		System.out.println("2nd largest number in array is: " +data[secondLargestNumIndex]);
	}
}
