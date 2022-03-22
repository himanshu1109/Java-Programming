import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter sides of triangle : ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        double s = (double)(a+b+c)/2;
        System.out.println(s);
        double p = s*(s-a)*(s-b)*(s-c);
        System.out.println(p);
        double area = Math.sqrt(p);
        System.out.println("Area of triangle : " + area);
    }
}
