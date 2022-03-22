import java.util.Scanner;

public class Absolute{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        float n = sc.nextFloat();
        System.out.println("The absolute value is :");
        System.out.println(Math.abs(n));
    }
}
