package Constructors;

public class Box   {
    double width;
    double length;
    double depth;
    
    Box() {
        System.out.println("Constructing Box WITHOUT params");
        width = 0;
        length = 0;
        depth = 0;
    }

    Box(double h, double w, double d)   {
        System.out.println("Constructing Box WITH params");
        width = w;
        length = h;
        depth = d;
    }

    void display(){
        System.out.println("----------------------------------");
        System.out.println("Length: "+ this.length);
        System.out.println("Width: "+ this.width);
        System.out.println("Depth: "+ this.depth);
        System.out.println("--- Volume: "+ this.volume()+" ---");        
    }
    double volume () {
        return width*length*depth;
    }
}