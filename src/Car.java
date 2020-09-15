
public class Car {

	public void woof() 
	{
		System.out.println("WOOOOOOF");
	}
	
	private int number;
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int newNum) {
		number = newNum;
	}
	
	
	public Car(int carNum) {
		number = carNum;
	}
}
