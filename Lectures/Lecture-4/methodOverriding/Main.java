package methodOverriding;

public class Main {
    public static void main(String argv[]){
        Sub b = new Sub();
        b.display(); // display() method of base class will be overridden unless we use "super" keyword
        Super s = new Sub(); // This will create an object of type Sub and NOT Super
        s.display();
    }
    // Limitations of super:
    // 1. Static methods cannot be overridden
    // 2. Super cannot be invoked in static methods
    // 3. Super should generally be the first line

    /*
        final keyword is used to make a variable constant
         or
        final function cannot be overriden
         or
        final classes cannot be inheritted
        **************************************************
        If you try to do these you get an error
        **************************************************
    */
}
