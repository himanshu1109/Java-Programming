import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number u want to check");
        int n = sc.nextInt();

        for (int i=2;i<=n/2;i++) {
            if (n % i == 0){
                System.out.println(n + " is not a prime number");
                flag=1;
                break;
            }
        }
        if (flag==0){
            System.out.println(n + " is a prime number");

        }
    }
}
