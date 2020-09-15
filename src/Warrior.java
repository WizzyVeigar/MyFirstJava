
public class Warrior extends Person implements IDoStuff, IAmHere
{
	public Warrior() {
		setName("Warrior");
	}

	public void SayStuff() {
		System.out.println("Hello I am " + getName());
	}

	@Override
	public void ImplementMe() {
		// TODO Auto-generated method stub
		
	}
}
