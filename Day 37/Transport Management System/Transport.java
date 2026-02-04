package transportmanagementsystem;

public abstract class Transport 
{
    protected int PassengerID;
    protected String PassengerName;
    protected String Fromcity;
    protected String Tocity;
    protected double Distence;
    protected double Fare;

    public Transport(int PassengerID, String PassengerName, String Fromcity, String Tocity, double Distence, double Fare) {
        this.PassengerID = PassengerID;
        this.PassengerName = PassengerName;
        this.Fromcity = Fromcity;
        this.Tocity = Tocity;
        this.Distence = Distence;
        this.Fare = Fare;
    }
    abstract void CalculateFare();
    
    void displayTic()
    {
        System.out.println("\n*****TICKET DETIAS*****");
        System.out.println("Passenger ID : " + PassengerID);
        System.out.println("Passenger Name : " + PassengerName);
        System.out.println("Route : " + Fromcity + "-->" + Tocity);
        System.out.println("Distance : " + Distence + "Km");
        System.out.println("Total Fare : $" + Fare);
    }
}
