import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        int hcf = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i=1;i<=a || i<=b ; i++){
            if (a%i==0 && b%i==0){
                hcf = i;
            }

        }
        System.out.println("HCF of given number : " + hcf);
    }
}
