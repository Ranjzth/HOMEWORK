import java.util.Scanner;
class Store
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Row Name : ");
		int row=sc.nextInt();
		System.out.print("Enter The Column Name : ");
		int col=sc.nextInt();
		
		sc.nextLine();
	
		String a[][]=new String [row][col];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("Enetr The Name of " + i +"," + j +" intex : ");
				a[i][j]=sc.nextLine();
			}	
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"  ");
			}	
		System.out.println("");	
		}
	}
}