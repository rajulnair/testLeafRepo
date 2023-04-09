package week2.day1;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println("Original string: " +text + "\n");
		String[] arr = text.split(" ");
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			int countDuplicates = 0;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
						countDuplicates++;
						arr[j]=" ";
					};
		}
			if (countDuplicates > 0) {
				arr[i]=" ";
			}
		}
		System.out.print("\n" + "Modified string: "); 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!= " ") {
				System.out.print(arr[i] + " ");
			}
		}
	}
}