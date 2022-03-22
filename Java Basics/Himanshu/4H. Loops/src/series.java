import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of terms of series :");
        int n = sc.nextInt();
        double sum = 0;
        for(int i = 1;i<=n;i++){
            sum += (double) (1.0/i);
        }
        System.out.println("The sum is : "+sum);
    }
}
