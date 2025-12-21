class Number
{
	public static void main(String[] args)
	{
		int a=10;
		int a1=a+=5;
		int a2=a-=3;
		int a3=a*=2;
		int a4=a/=4;
		System.out.println("ORIGINAL : "+a);
		System.out.println("AFTER : "+a1);
		System.out.println("AFTER : "+a2);
		System.out.println("AFTER : "+a3);
		System.out.println("AFTER : "+a4);
	}
}