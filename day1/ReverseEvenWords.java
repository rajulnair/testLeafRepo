package week2.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		System.out.println("Original string: " +test);
		System.out.print("Modified string: ");
		String[] arr = test.split(" ");
		
		
		for (int i = 0; i < arr.length; i++) {
			if ((i+1)%2==0) {
				String data = arr[i];
				char[] charArray = data.toCharArray();
				for (int j = charArray.length-1; j >= 0; j--) {
					System.out.print(charArray[j]);	
				}
				System.out.print(" ");
			}
			else {
					System.out.print(arr[i] + " ");
				};
			}
		}
	}

