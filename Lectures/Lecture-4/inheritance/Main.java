package inheritance;

public class Main {
    public static void main(String args[]){
        ExtendedBox b = new ExtendedBox(10, 20, 30); 
        // Constructor of parent class is also invoked 
        // The above is not done just for the extreme parent but all ancestor classes
        b.display();
    }
}
