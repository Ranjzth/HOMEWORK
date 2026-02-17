package empolyee;

public class Contract extends Empolyeeee implements Runnable
{

    public Contract(double Salary)
    {
        super(Salary);
    }
    
    @Override
    public void run()
    {
        try 
        {
            Thread.sleep(1000);
        } 
        catch (InterruptedException ex) 
        {
            System.getLogger(Contract.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
                System.out.println("Contract Empolyee Salary Calculated");
    }
}
