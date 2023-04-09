package week1.day2;

public class MobileW1D2 {

	public static void main(String[] args) {
		String mobileBrandName = "Erricsson";
		char mobileLogo = 'E';
		short noOfMobilePiece = 10;
		int modelNumber = 2550;
		long mobileImeiNumber = 1232435545367789990L;
		float mobilePrice = 54699.99f;
		boolean isDamaged = false;

		
		System.out.println("Mobile Phone is: " +mobileBrandName + " " +modelNumber + ", and has the logo: " +mobileLogo);
		System.out.println("The phone's IMEI number is: " +mobileImeiNumber + " and the number of pieces available is: " +noOfMobilePiece);
		System.out.println("Is it damaged? " +isDamaged);
		System.out.println("OK, then what is it's price: " +mobilePrice);

	}

}
