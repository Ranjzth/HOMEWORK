package empolyee;

public class Permanent extends Empolyeeee implements Runnable
{

    public Permanent(double Salary) 
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
            System.getLogger(Permanent.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        System.out.println("Permanent Empolyee Salary Calculated");
    }
}
