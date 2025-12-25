import java.util.Scanner;
class Greadevaluation
{
	public static void main(String[] args)
	{
		Scanner bk = new Scanner(System.in);
		System.out.print("choose your option : ");
		char a=bk.next().charAt(0);
		switch(a)
		{
			case 'A':
			System.out.println("very good");
			break;
			
			case 'B':
			System.out.println("good");
			break;
			
			case 'C':
			System.out.println("bad");
			break;
			
			case 'D':
			System.out.println("very bad");
			break;
			
			case 'F':
			System.out.println("very good");
			break;
			
			default:
			System.out.println("error");
		}
	}
}