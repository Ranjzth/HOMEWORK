package student;

public abstract class Coures 
{
    protected String CourseName;

    public Coures(String CouresName) 
    {
        this.CourseName = CourseName;
    }
    abstract void JoinCourse(Student Student);
}
