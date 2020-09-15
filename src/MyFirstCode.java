

public class MyFirstCode 
{
	public static void main(String args[])
	{
		int s = 100; 
		int k = 20; 
		if(k >= s ) 
		{ 
			System.out.print(s + k); 	
		} 
		else if(s >= k) 
		{ 
			System.out.print("How are you doing," + s + " Is higher"); 
		} 
		
		String name = "Bob";
		System.out.println(name.toUpperCase());
		System.out.println(FuckMarc());
		
		Car car = new Car(80);
		Warrior p1 = new Warrior();
		
		
		
		System.out.println(car.getNumber());
	}
	
	
	public static String FuckMarc() 
	{
		return "Fuck Marc";
	}
}
