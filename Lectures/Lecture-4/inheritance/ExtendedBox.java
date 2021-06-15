package inheritance;

public class ExtendedBox extends Box{
    public double height;   
    ExtendedBox(){
        System.out.println("New Extened box");
    } 
    ExtendedBox(double x, double y, double z){
        super(x, y); // Used to invoke the base class constructor
        this.height = z;
    }
    double volume(){
        return this.area()*this.height;
    }
    void display(){
        System.out.println("---------------------------");
        System.out.println("Length: "+this.length);
        System.out.println("Width: "+this.width);
        System.out.println("Height: "+this.height);
        System.out.println("***Volume: "+this.volume()+"***");
    }
}
