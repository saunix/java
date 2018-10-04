class outerInner{
	class inner
	{
	void travel()
		{
	System.out.println("Singapore");
		}
	}
	public static void main(String[] args)
	{
	outerInner book= new outerInner();
	outerInner.inner s= book.new inner();
	 s.travel();
	}
}
