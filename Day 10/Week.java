import java.util.Scanner;
class Week
{
	public static void main(String[] args)
	{
		Scanner bk = new Scanner(System.in);
		System.out.print("choose your day : ");
		int a=bk.nextInt();
		switch(a)
		{
			case 1 -> System.out.println("Monday");
			case 2 -> System.out.println("Tuesday");
			case 3 -> System.out.println("Wednesday");
			case 4 -> System.out.println("Tursday");
			case 5 -> System.out.println("Friday");
			case 6 -> System.out.println("Saturday");
			case 7 -> System.out.println("sunday");
			default -> System.out.println("Next Week");	
		}
	}
}