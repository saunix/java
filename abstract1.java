abstract class abstract2
{
	abstract void subclass();
}
class B extends abstract2
{
	void subclass()
		{
		System.out.println("this is subclass");
		}
}

public class abstract1 {

	public static void main(String[] args)
	{
		B obj= new B();
		obj.subclass();
	}
}
