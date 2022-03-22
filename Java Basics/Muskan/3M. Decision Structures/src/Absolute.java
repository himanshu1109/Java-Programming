import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of which u want absolute value");
        float f = sc.nextFloat();
        float n = Math.abs(f);
        System.out.println(n);
    }
}

