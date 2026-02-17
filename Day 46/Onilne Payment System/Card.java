package online.payment.system;

public class Card extends Payment
{

    public Card(double Amount) 
    {
        super(Amount);
    }
    
    @Override
    void ProcessPayment()
    {
        try 
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex) {
            System.out.println(ex);
        }
        System.out.println("Card Payment of "+ Amount + " Completed");
    }
}
