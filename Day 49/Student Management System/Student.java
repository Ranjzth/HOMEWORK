package studentmanagementsystem;

public class Student
{
    int id;
    String Name;

    public Student(int id, String Name) 
    {
        this.id = id;
        this.Name = Name;
    }

    public int getId() 
    {
        return id;
    }

    public String getName()
    {
        return Name;
    }
}