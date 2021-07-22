/*
Hierarchical inheritance with polymorphism
Write a program to create a class named shape. In this class we have three sub
classes circle, triangle and square. Each class has two member functions named
draw () and erase (). Create objects to call respective functions using polymorphism
concept. Clearly show the difference in object creating in case of inheritance and
polymorphism.
Hint: Identify the difference between
superclass obj = new subclass();
superclass obj = new superclass();
subclass obj = new subclass();
subclass obj = new superclass();
*/

package src.problem1;

public class Main {
    public static void main(String args[]){
        Shape  sh0 = new Square();
        sh0.draw();
        Shape  sh1 = new Shape();
        sh1.draw();
        Square sh2 = new Square();
        sh2.draw();
        // Square sh3 = new Circle(); // Gives error because dynamic dispatch doesnt work with super classes
    }
}
