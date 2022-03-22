import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int p = 1;
        for(int i = 1;i<=y;i++){
            p *= x;
        }
        System.out.println("Power of "+x+" to the power of "+y+" is : "+p);
    }
}
