class Result
{
	int m1,m2,m3;
	int total;
	float percentage;
	
	void mark(int a,int b,int c)
	{
		m1 = a;
		m2 = b;
		m3 = c;
	}
	
	int cal_total()
	{
		total=m1+m2+m3;
		return total;
	}
	
	float cal_percentage()
	{
		percentage= total/3.0f;
		return percentage;
	}
	
	void result()
	{
		if(percentage>=40)
			System.out.println("PASS");
		else
			System.out.println("FAIL");
	}
	
	void grade()
	{
		if(percentage>=75)
			System.out.println("Grade A");
		else if(percentage>=60)
			System.out.println("Grade B");
		else if(percentage>=40)
			System.out.println("Grade C");
		else
			System.out.println("Grade F");	
	}
	
	public static void main(String[] args)
	{
		Result a = new Result();
		
		a.mark(70,80,90);
		
		System.out.println("Total Mark = "+a.cal_total());
		System.out.println("Percentage = "+a.cal_percentage()+"%");
		
		a.result();
		a.grade();
		
		
	}
}