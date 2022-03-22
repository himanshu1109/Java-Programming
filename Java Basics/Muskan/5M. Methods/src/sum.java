import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 number of which you want sum : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = getTotal(x,y);
        System.out.println("Sum of number is : " + sum);

    }
    public static int getTotal(int a,int b){
        return a+b;
    }
}
