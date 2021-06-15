package inheritance;

public class Box {
    public double length;
    public double width;
    
    Box(){
        System.out.println("New box");
    } 
    Box(double l, double w){
        this.width = w;
        this.length = l;
    }
    double area(){
        return this.width*this.length;
    }
}


