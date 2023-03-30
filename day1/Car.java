package week1.day1;

public class Car {

	public static void main(String[] args) {
		Car Toyota = new Car();
		Toyota.driveCar();
		Toyota.soundHorn();
		Toyota.isPuncture();
	}
	
	public void driveCar() {
		System.out.println("I am driving a car");

	}
	
	public void soundHorn() {
		System.out.println("Sound the horn");

	}
	
	public void isPuncture() {
		System.out.println("Is car punctured?");

	}
	

}
