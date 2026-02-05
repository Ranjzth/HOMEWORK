package person;

public class Person
{
    private String Name;
    private int Age;
    
    Person()
    {
        Name = "Geeks";
        Age = 10;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String Name) 
    {
        this.Name = Name;
    }

    public int getAge()
    {
        return Age;
    }

    public void setAge(int Age) 
    {
        this.Age = Age;
    }
}
