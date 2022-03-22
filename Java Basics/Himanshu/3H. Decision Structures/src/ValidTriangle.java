import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three angles of triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a+b+c)==180) {
            System.out.println("It ia triangle");
        }
        else {
            System.out.println("It is not a triangle");
        }
    }
}
