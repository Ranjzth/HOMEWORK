import java.util.Scanner;
class Charactor
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Row Letter : ");
		int row=sc.nextInt();
		System.out.print("Enter The Column Letter : ");
		int col=sc.nextInt();
		
		sc.next().charAt(0);
	
		char a[][]=new char [row][col];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("Enetr The Name of " + i +"," + j +" intex : ");
				a[i][j]=sc.next().charAt(0);
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