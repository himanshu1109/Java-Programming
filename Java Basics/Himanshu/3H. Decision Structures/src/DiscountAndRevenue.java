import java.util.Scanner;

public class DiscountAndRevenue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Price:");
        Long price = sc.nextLong();
        System.out.println("Enter Quantity");
        Long quantity = sc.nextLong();
        Long revenue = price * quantity;
        if(revenue>5000){
            Double netRevenue =  revenue*0.9;
            System.out.println("Net Revenue is : "+netRevenue);
        }
        else{
            System.out.println("Net Revenue is : "+revenue);
        }
    }
}
