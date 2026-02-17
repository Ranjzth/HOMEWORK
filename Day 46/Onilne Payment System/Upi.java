package online.payment.system;

public class Upi extends Payment
{

    public Upi(double Amount) 
    {
        super(Amount);
    }
    
    void ProcessPayment()
    {
        try
        {
            Thread.sleep(1000);
        } 
        catch (InterruptedException ex)
        {
            System.getLogger(Upi.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
                System.out.println("UPI Payment of "+ Amount + " Completed");
    }
}
