package shoppingcartapplication;

public class Product 
{
    int Id;
    String Name;
    double Price;
    Product next;

    public Product(int Id, String Name, double Price) {
        this.Id = Id;
        this.Name = Name;
        this.Price = Price;
        this.next = null;
    }
}
