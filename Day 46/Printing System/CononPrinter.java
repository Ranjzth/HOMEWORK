package printingsystem;

public class CononPrinter implements Printer,Runnable
{
   @Override
   public void PrintDoc()
   {
       System.out.println("canon Printer Printing");
   }
   
   @Override
   public void run()
   {
       PrintDoc();
   }
}
