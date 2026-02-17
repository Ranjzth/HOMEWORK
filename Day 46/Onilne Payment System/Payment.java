package online.payment.system;

abstract class Payment implements Runnable 
{
    double Amount;

    public Payment(double Amount) 
    {
        this.Amount = Amount;
    }
    
    abstract void ProcessPayment();
            
    @Override
    public void run()
    {
        ProcessPayment();
    }
}
