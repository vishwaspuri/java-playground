package Constructors;



public class Main{
    public static void main(String args[])  {
        Box box = new Box(17,15,65);
        Box box2 = new Box();
        box.display();
        box2.display();
        box2 = box;
        box2.display();
    }
}
