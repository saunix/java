class bookss
{
	public void read()
	{
	System.out.println("read novels");
	}
}
class physics extends bookss
{
	public void read() {
	System.out.println("physics is the best");
}
}

class hehe
{
	public static void main(String[] args)
	{
		
		physics b= new physics();
		
		b.read();
	}		
}
