import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int x = sc.nextInt();
        int res = 0;
        int num = x;
        for(int i=x;i>0;i/=10){
            int remainder = num%10;
            res = res*10+remainder;
            num = num/10;
        }
        System.out.println("The Reversed Number is : "+res);
    }
}
