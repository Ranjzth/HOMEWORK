class Bank
{
    float balance = 0;

    void setBalance(float amount)
    {
        balance = amount;
        System.out.println("Balance : " + balance);
    }

 
    void deposit(float amount)
    {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

 
    void withdraw(float amount)
    {
        if (amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
        else
        {
          
        }
    }

   
    void displayBalance()
    {
        System.out.println("Available Balance: " + balance);
    }

    public static void main(String[] args)
    {
        Bank b = new Bank();

        b.setBalance(1000);    
        b.deposit(500);      
        b.withdraw(300);        
        b.displayBalance();    
		
        b.withdraw(2000);     
    }
}