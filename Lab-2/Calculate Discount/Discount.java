import java.util.*;  

public class Discount {
    static int getDiscount(int quantity)   {
        if (quantity >= 100 && quantity <= 120) return 10;
        else if(quantity > 120) return 15;
        else return 0;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        int unit_price = sc.nextInt();
        System.out.print("\nEnter quantity: ");
        int quantity = sc.nextInt();
        System.out.print("\nRevenue before discount: $"+unit_price*quantity);
        int discount = getDiscount(quantity);
        System.out.print("\nDiscounted Amount: $"+unit_price*quantity*discount/100);
        System.out.print("\nThe revenue from the sale after discount: $"+unit_price*quantity*(1-discount/100)+"\n");
    }
}