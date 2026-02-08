package shoppingcartapplication;

public class ShoppingCart
{
    Product Head;

    public ShoppingCart(Product Head) 
    {
        this.Head = Head;
    }

    ShoppingCart()
    {
        
    }
    
    void Insert(int Id,String Name,double Price)
    {
        Product p = new Product(Id,Name,Price);
        
        if(Head == null)
        {
            Head = p;
        }
        else
        {
            Product temp = Head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next=p;
        }
        System.out.println("Product Addad To Cart Successfully");
    }
    
        void display()
        {
            if(Head == null)
            {
                System.out.println("Cart Is Empty.");
                return;
            }
            
            Product temp = Head;
            System.out.println("\n******Shopping Cart Items******");
            while(temp != null)
            {
                System.out.println("Product Id : "+ temp.Id);
                System.out.println("Product Name : "+temp.Name);
                System.out.println("Price : $"+ temp.Price);
                System.out.println("*****************************");
                temp = temp.next;
            }
            
        }
    }

