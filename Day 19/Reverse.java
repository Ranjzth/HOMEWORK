import java.util.Scanner;
class Reverse
{
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[10];
	
	void EnterNum()
	{
		for(int i=0;i<10;i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	
	void DisplayNum()
	{
		for(int i=0;i<10;i++)
		{
		 System.out.print(arr[i]);
		}
	}
	
	void ReverseNum()
	{
		for(int i=9;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
	}
	
	void Menu()
	{
	int option;
	
	do
	{
		System.out.println("\n********MENU********");
		System.out.println("1.Enter Number");
		System.out.println("2.Display The Number");
		System.out.println("3.Display Numbers in Reverse Order");
		System.out.println("4.Exit");
		System.out.println("Enter The Option : ");
		option = sc.nextInt();
		
		switch(option)
		{
			case 1:
				System.out.println("Enter The 10 Number : ");
				EnterNum();
				break;
			
			case 2:
				System.out.println("Display The Number : ");
				DisplayNum();
				break;
			
			case 3:
				System.out.println("Reverse Order : ");
				ReverseNum();
				break;
			
			case 4:
				System.out.println("Exit");
				break;

			default :

		}
	}while(option!=4);
	}
	
	public static void main(String[] args)
	{
		Reverse a = new Reverse();
		a.Menu();
	}

}