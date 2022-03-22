import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Enter a power");
        int p = sc.nextInt();
        int result=1;
        while (p != 0) {
            result = result*n;
            p--;
        }
        System.out.println(result);
    }
}
