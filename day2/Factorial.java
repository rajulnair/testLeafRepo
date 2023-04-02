package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		int num = 5;
		int product = 1;
		
	for (int i = 1; i <= num; i++) {
		product = i * product;
	}
	System.out.print("factorial of " +num + " is: " +product);
}
}
