import java.util.Scanner;

public class DiscountAndRevenue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter price of product");
        double price = sc.nextDouble();
        System.out.println("Enter quantity");
        int quantity = sc.nextInt();
        double revenue = price*quantity;
        double discount = revenue/10;
        System.out.println("discount " + discount);
        if (revenue>5000){
            System.out.println(revenue-discount);
        }
        else {
            System.out.println(revenue);
        }
    }
}
