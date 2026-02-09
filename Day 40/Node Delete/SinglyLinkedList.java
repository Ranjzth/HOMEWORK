package node;

public class SinglyLinkedList 
{
    Node Head;
    
    void insert(int Data)
    {
        Node n = new Node(Data);

        if (Head == null) 
        {
            Head = n;
            return;
        }

        Node temp = Head;
        while (temp.Next != null) 
        {
            temp = temp.Next;
        }
        temp.Next = n;
    }
    
    
    void delete(int key)
    {
        Node temp = Head, prev = null;


        if (temp != null && temp.Data == key) 
        {
            Head = temp.Next;
            return;
        }

        while (temp != null && temp.Data != key) 
        {
            prev = temp;
            temp = temp.Next;
        }

        if (temp == null)
        {
            return;
        }

        prev.Next = temp.Next;
    }

    void display() 
    {
        Node temp = Head;
        while (temp != null) 
        {
            System.out.print(temp.Data + " ");
            temp = temp.Next;
        }
    }
}

