import java.util.Scanner;

public class doWhileSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        char wishes;
        do {
            System.out.println("Enter first number");
            a= sc.nextInt();
            System.out.println("Enter second number");
            b = sc.nextInt();
            int sum = a+b;
            System.out.println("Sum of above number is " + sum);
            System.out.println("Do you want to perform another operation ? y or n");
            wishes = sc.next().charAt(0);

        } while (wishes == 'y'  || wishes == 'Y');
    }
}
