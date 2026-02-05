package student;

public class Student 
{
    private int Id;
    private String Name;

    public Student(int Id,String Name) 
    {
        this.Id = Id;
        this.Name = Name;
    }
   
    public int getId() 
    {
        return Id;
    }

    public String getName() 
    {
        return Name;
    }    
    
}
