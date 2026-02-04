package transportmanagementsystem;

public class LuxuryBus extends Transport
{

    public LuxuryBus(int PassengerID, String PassengerName, String Fromcity, String Tocity, double Distence, double Fare)
    {
        super(PassengerID,PassengerName,Fromcity,Tocity,Distence,Fare);
    }

    @Override
    void CalculateFare()
    {
        Fare = (Distence * 10) + 200;
    }
}
