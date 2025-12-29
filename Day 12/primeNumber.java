import java.util.Scanner;
class primeNumber
{
	public static void main(String[] args)
	{
		Scanner bk=new Scanner(System.in);
		System.out.print("Enter the value : ");
		
		int num = bk.nextInt();
		
		if(num <= 1)
			System.out.println(num+"is not prime Number");
		
		else if(num==2 || num==3 || num==5 || num==7)
			System.out.println(num+"is prime number");
		
		else if(num%2==0 || num%3==0 || num%5==0 || num%7==0)
			System.out.println(num+"is not prime Number");
		
		else
			System.out.println(num+"is prime Number");
	}
}