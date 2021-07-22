/*
Create a superclass with constructor, parameterised constructor and display method
to compute and display the sum. Create a subclass which inherits superclass and
also have the constructor, parameterised constructor and display method to compute
sum of three numbers.
● Identify and check which display method is being invoked.
● Try to use super keyword in subclass.
*/
package src.problem2;

public class Main {
    public static void main(String args[]){
        ThreeSum sum = new ThreeSum(12,11,29);
        System.out.println(sum.Sum());
    }
}
