import java.util.Scanner;
class ElectricityBill
{
	public static void main(String[] args)
	{
		Scanner bk=new Scanner(System.in);
		System.out.print("Enter the  unit : ");
		
		int unit=bk.nextInt();
		int charge;
		
		if(unit <=100)
			charge = unit * 5;
		else if(unit <= 200)
			charge = (100 * 5) + (unit - 100) * 7;
		else
			charge =(100 * 5) + (100 * 7) + (unit -200)*10;
			System.out.println("ElectricityBill : " +charge);
	}
}