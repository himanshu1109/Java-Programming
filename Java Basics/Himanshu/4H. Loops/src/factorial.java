import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = n;i>0;i--){
            fact *= i;
        }
        System.out.println("Factorial of "+n+" is : "+fact);
    }
}
