package Constructors;



public class Main{
    public static void main(String args[])  {
        Box box = new Box(17,15,65);
        Box box2 = new Box();
        box.display();
        box2.display();
        // After the next line both box2 and box will point to the same memory. 
        box2 = box;
        box2.display();
        box2.length = 10; // This change gets transmitted. 
        box.display();
        box2.display();
        
    }
}
