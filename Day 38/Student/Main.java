package student;

public class Main 
{
    public static void main(String[] args) 
    {
        Student St = new Student(1, "Ravi ");
        
        JavaCourse Jc = new JavaCourse("Java");
        
        Jc.JoinCourse(St);
    }
}
