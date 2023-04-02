package week1.day2;

public class ConvertNegNumToPos {

	public static void main(String[] args) {
		int num=-22;
		
		if (num == 0) {
			System.out.println("Number is zero. No conversion required: " +num);
		} else if (num < 0) {
			num = -num;
			System.out.println("Converted negative number to positive number: "+num);
		} else {
			System.out.println("Number is already positive. No conversion required: "+num);

	}

}
}
