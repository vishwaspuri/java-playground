import java.util.*;  

public class reverseANumber {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        while(num>0){
            System.out.println(num%10+" ");
            num = num / 10;
        }    
    }    
}
