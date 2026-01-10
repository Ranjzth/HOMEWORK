import java.util.Scanner;
class Number
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
	
	void PositiveNum()
	{
		int cnt=0;
		for(int i=0;i<10;i++)
		{
			if(arr[i]>0)
			{
				cnt++;
			}
		}
			System.out.print(cnt);
	}
	
	void negativeNum()
	{
		int cnt=0;
		for(int i=0;i<10;i++)
		{
			if(arr[i]<0)
			{
				cnt++;
			}
		}
			System.out.print(cnt);
	}
	
	void ZerosNum()
	{
		int cnt=0;
		for(int i=0;i<10;i++)
		{
			if(arr[i]==0)
			{
				cnt++;
			}
		}
			System.out.print(cnt);
	}
	
	
	void Menu()
	{
	int option;
	
	do
	{
		System.out.println("\n********MENU********");
		System.out.println("1.Enter Number");
		System.out.println("2.Display The Number");
		System.out.println("3.count positive Number");
		System.out.println("3.count nagative Number");
		System.out.println("3.count zeros");
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
				System.out.print("count Position Number : ");
				PositiveNum();
				break;
			
			case 4:
				System.out.print("count nagative Number : ");
				negativeNum();
				break;
				
			case 5:
				System.out.print("count zeros : ");
				ZerosNum();
				break;	

			case 6:
				System.out.println("exit");
				break;
				
			default :

		}
	}while(option!=6);
	}
	
	public static void main(String[] args)
	{
		Number a = new Number();
		a.Menu();
	}

}
