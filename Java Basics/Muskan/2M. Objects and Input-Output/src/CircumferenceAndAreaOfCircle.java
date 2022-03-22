import java.util.Scanner;

public class CircumferenceAndAreaOfCircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter radius : ");
        int r = sc.nextInt();
        double circumference = 2*Math.PI*r;
        double area= Math.PI*r*r;
        System.out.println("Circumference of circle : " + circumference);
        System.out.println("Area of circle : " + area);
    }

}
