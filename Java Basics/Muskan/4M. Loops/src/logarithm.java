import java.util.Scanner;

public class logarithm {
    public static void main(String[] args) {
        double sum=0;
        int sign =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number till which u want series sum : ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            sum += (1.0*sign)/i;
            sign *= -1;
        }
        System.out.println("sum of series : "+  sum);
    }
}
