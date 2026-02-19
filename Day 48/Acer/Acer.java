package acer;

public class Acer 
{

    String model;
    String colour;
    boolean rgbKeyboard;
    String processor;
    double price;

   
    Acer(String model, String colour, boolean rgbKeyboard, String processor, double price) 
{
        this.model = model;
        this.colour = colour;
        this.rgbKeyboard = rgbKeyboard;
        this.processor = processor;
        this.price = price;
    }

    
    void display() 
{
        System.out.println("Laptop name : " + model);
        System.out.println("Color of the laptop: " + colour);
        System.out.println("It is rgb keyboard: " + rgbKeyboard);
        System.out.println("Processor: " + processor);
        System.out.println("Price of the Laptop : " + price);
    }
}

