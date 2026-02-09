package node;

public class Main 
{
    public static void main(String[] args)
    {
        SinglyLinkedList sc = new SinglyLinkedList();
        
        sc.insert(25);
        sc.insert(32);
        sc.insert(45);
        sc.insert(6);
        sc.insert(24);
        sc.insert(52);
        
        sc.display();
        
        System.out.println("");
        
        sc.delete(6);
        
        System.out.println("Deleted");
        sc.display();
    }
}
