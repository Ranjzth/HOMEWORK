import java.util.Scanner;
class ShapeArea
{
	public static void main(String[] args)
	{
		Scanner bk = new Scanner(System.in);
		System.out.print("choose your day : ");
		int a=bk.nextInt();
		switch(a)
		{
			case 1 -> System.out.println("circle");
			case 2 -> System.out.println("Square");
			case 3 -> System.out.println("rectangle");
			case 4 -> System.out.println("triangle");
			default -> System.out.println("Error");	
		}
	}
}