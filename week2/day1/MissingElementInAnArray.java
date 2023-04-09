package week2.day1;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		System.out.println("Original array was: " +Arrays.toString(arr));
		System.out.println("Length of array is: " +arr.length);
		Arrays.sort(arr);
		System.out.println("Sorted array is: " +Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			
			if ((i+1) != arr[i]) {
				System.out.println("Missing element in array is: " +(i+1));
				break;
			}
			else {
				continue;
			}
			
		}

	}

}
