import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number of which you want a factorial value : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact=1;
        if (n==0){
            System.out.println(1);
        }
        else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println(fact);
        }
    }
}

