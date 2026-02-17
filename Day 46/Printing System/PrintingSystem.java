package printingsystem;

import java.net.CacheRequest;

public class PrintingSystem 
{
    public static void main(String[] args) 
    {
        Hpprinter h1 = new Hpprinter();
        CononPrinter c1 = new CononPrinter();
        
        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(c1);
        
        t1.start();
        t2.start();
        
    }
    
}
