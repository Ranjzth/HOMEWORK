package printingsystem;

public class Hpprinter implements Printer,Runnable
{
    @Override
    public void PrintDoc()
    {
        System.out.println("HP Printer Printing");
    }
    
    @Override
    public void run()
    {
        PrintDoc();
    }
}
