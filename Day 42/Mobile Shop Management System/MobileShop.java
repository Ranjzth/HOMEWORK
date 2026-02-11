package mobile.shop.management.system;

public class MobileShop 
{
    private Node head;   

    
    public void insertAtHead(int mobileId, String brandName, double price) {
        Node newNode = new Node(mobileId, brandName, price);
        newNode.next = head;
        head = newNode;
        System.out.println("Latest Launch Mobile Added Successfully!");
    }

    // Insert at Tail (Regular Stock)
    public void insertAtTail(int mobileId, String brandName, double price) {
        Node newNode = new Node(mobileId, brandName, price);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
             }

        System.out.println("Regular Stock Mobile Added Successfully!");
    }

    
    public void display() {
        if (head == null) {
            System.out.println("No mobiles available in the shop.");
            return;
        }

        Node temp = head;
        System.out.println("\nAvailable Mobiles:");
        System.out.println("-----------------------------------");

        while (temp != null) {
            System.out.println("Mobile ID: " + temp.mobileId);
            System.out.println("Brand Name: " + temp.brandName);
            System.out.println("Price: $" + temp.price);
            System.out.println("-----------------------------------");
            temp = temp.next;
              }
    }
}
