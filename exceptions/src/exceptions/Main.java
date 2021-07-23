package exceptions;

import java.util.InputMismatchException;
import java.util.*;
public class Main {
    public static void main(String ...args){
        int age = Integer.MIN_VALUE;;
        boolean keepGoing = true;
        Scanner scanner = new Scanner(System.in);
        while(keepGoing){
            System.out.print("Enter age: ");
            try {
                age = scanner.nextInt();
                keepGoing = false;
            }
            catch(InputMismatchException e){
                scanner.next();
                e.printStackTrace();
                System.out.println("Invalid Entry. Please enter digits only.");
            }
        }
        scanner.close();
        System.out.println(age);
    }
}
