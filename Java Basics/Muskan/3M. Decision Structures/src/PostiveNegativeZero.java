import java.util.Scanner;

public class PostiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Integer");
        int n = sc.nextInt();
        if (n>0){
            System.out.println("positive number");
        }
        else if (n<0){
            System.out.println("Negative number");
        }
        else {
            System.out.println("equal to 0");
        }
    }
}
