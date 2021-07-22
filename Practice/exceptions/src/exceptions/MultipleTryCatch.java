package exceptions;
import java.util.*;

public class MultipleTryCatch {
    public static void main(String ...args){
        int age = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("Enter age: ");
                age = sc.nextInt();
                if(age<0){
                    throw new Exception("Negative age not allowed");
                }
                System.out.println(age);
                break;
            }
            catch(InputMismatchException e){
                sc.next();
                System.out.println(e.getMessage());
            } 
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            
        }
        sc.close();
    }
}
