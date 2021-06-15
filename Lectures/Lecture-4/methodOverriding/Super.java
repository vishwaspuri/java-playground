package methodOverriding;

public class Super {
    int x;
    final int z; 
    Super(){
        this.x=11;
        this.z = 10;
        System.out.println("New Super box");
    }
    void display(){
        System.out.println("x = "+x);
        System.out.println("z = "+z);
    }
}


