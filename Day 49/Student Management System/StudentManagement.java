package studentmanagementsystem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentManagement 
{
    Set<Integer> Ids = new HashSet<>();
    Map<Integer,String>  map = new HashMap<>();
    
    
    
    
    
    void AddStu(int id,String Name)
    {
        if(Ids.contains(id))
        {
            System.out.println("Student ID Already Exists");
        }
        else
        {
            Ids.add(id);
            map.put(id, Name);
            System.out.println("Added SuccessFully");
        }
    }
    
    
    
    
    
    
    
    
    
    void Remove(int id)
    {
        if(Ids.contains(id))
        {
            Ids.remove(id);
            map.remove(id);
            System.out.println("Remove SuccessFully");
        }
        else
        {
            System.out.println("Id Not Found");
        }
    }
    
    
    
    
    
    
    
    void SearchStu(int id)
    {
        if(map.containsKey(id))
        {
            System.out.println("Student Name : " + map.get(id));
        }
        else
        {
            System.out.println("Not Found");
        }
    }
    
    
    
    
    
    
    
    void DisplayAll()
    {
        if(map.isEmpty())
        {
            System.out.println("No Student Available");
        }
        else
        {
            for(Map.Entry<Integer,String>entry : map.entrySet())
            {
                System.out.println("Id : " + entry.getKey());
                System.out.println("Name : " + entry.getValue());
            }
        }
    }
    
    
    
    
    
    
    
    
    void Display()
    {
        System.out.println("Total Student : " + Ids.size());
    }   
}