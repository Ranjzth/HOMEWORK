package student;

public class JavaCourse extends Coures
{
    public JavaCourse(String CourseName)
    {
        super(CourseName);
    }

    @Override
    void JoinCourse(Student Student) 
    {
        System.out.println(Student.getName()+"Joined "+CourseName+" Course");
    }

    
}
