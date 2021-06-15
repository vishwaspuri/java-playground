package methodOverriding;

public class Sub extends Super{
    int y;  
    Sub(){
        super();
        System.out.println("New Sub box");
        this.y = 10;
    }
    void display(){
        System.out.println("----------------------------------------------------");
        System.out.println("Invoking base class non-static display function through super:-");
        super.display();
        System.out.println("----------------------------------------------------");
        System.out.println("Sub:-");
        System.out.println("x = "+this.x);
        System.out.println("y = "+this.y);
    }
}
