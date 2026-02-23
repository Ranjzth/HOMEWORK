package calculator1;


public class Calculator<T extends Number> 
{

    public double add(T num1, T num2)
    {
        return num1.doubleValue() + num2.doubleValue();
    }

    public double subtract(T num1, T num2)
    {
        return num1.doubleValue() - num2.doubleValue();
    }
}