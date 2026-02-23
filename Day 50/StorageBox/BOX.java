package box;
   
public class BOX<T>
{

    private T value;

    public void store(T value) 
    {
        this.value = value;
    }

    public T getValue()
    {
        return value;
    }
}