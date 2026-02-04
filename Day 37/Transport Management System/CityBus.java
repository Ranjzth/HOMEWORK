package transportmanagementsystem;

public class CityBus extends Transport
{

    public CityBus(int PassengerID, String PassengerName, String Fromcity, String Tocity, double Distence, double Fare)
    {
        super(PassengerID,PassengerName,Fromcity,Tocity,Distence,Fare);
    }
    
 
    @Override
    void CalculateFare()
    {
        Fare = Distence * 5;
    }
    
}
