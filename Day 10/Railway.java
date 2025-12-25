import java.util.Scanner;
class Railway
{
	public static void main(String[] args)
	{
		Scanner bk = new Scanner(System.in);
		System.out.print("choose your day : ");
		int a=bk.nextInt();
		switch(a)
		{
			case 1 -> System.out.println("General");
			case 2 -> System.out.println("Sleeper");
			case 3 -> System.out.println("AC 3 tier");
			case 4 -> System.out.println("AC 2 tier");
			case 5 -> System.out.println("First class");
			default -> System.out.println("Error");	
		}
	}
}