import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = getTotal(a,b);
        System.out.println("Sum is : "+sum);
    }
    public static int getTotal(int a, int b){
        int sum = a+b;
        return sum;
    }
}
