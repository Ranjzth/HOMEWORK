class And
{
	public static void main(String[] args)
	{
	int marks=85;
	boolean attendance=true;
	boolean discipline=true;
	System.out.print("PASS & ELIGIBLE FOR SCOLARSIP : ");
	System.out.println((attendance==discipline)&&(attendance!=discipline)||(attendance==discipline));
	}
}