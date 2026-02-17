package empolyee;

public class Empolyee
{
    public static void main(String[] args)
    {
        double PermanentSalary = 30000;
        double ContractSalary = 20000;
        
        Permanent p1 =new Permanent(PermanentSalary);
        Contract c2 = new Contract(ContractSalary);
        
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(c2);
        
        t1.start();
        t2.start();
        
    }
    
}
