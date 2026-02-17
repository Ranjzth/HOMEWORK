package online.payment.system;

public class OnlinePaymentSystem 
{
    public static void main(String[] args)
    {
       double Card = 2000;
       double Upi = 1500;
       
       Payment p1 = new Card(Card);
       Payment p2 = new Upi(Upi);
       
       Thread t1 = new Thread(p1);
       Thread t2 = new Thread(p2);
       
       t1.start();
       t2.start();
    }
    
}
