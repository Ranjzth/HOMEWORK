import java.util.Scanner;
class TrafficLight
{
	public static void main(String[] args)
	{
		Scanner bk = new Scanner(System.in);
		System.out.print("choose your day : ");
		String a=bk.nextLine();
		switch(a)
		{
			case "red" -> System.out.println("Stop");
			case "yellow" -> System.out.println("Ready");
			case "green" -> System.out.println("Go");
			default -> System.out.println("Error");	
		}
	}
}