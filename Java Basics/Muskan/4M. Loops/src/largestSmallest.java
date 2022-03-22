import java.util.Scanner;

public class largestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        char c=0;
        while (c != 'y') {
            System.out.println("Enter a number");
            num = sc.nextInt();
            if (num > max) {
                max= num;
            }
            if (num < min) {
                min = num;
            }
            System.out.println("Do u want to quit ? y or n");
            c = sc.next().charAt(0);
        }
        System.out.println("largest number : " + max);
        System.out.println("Smallest number :" + min);
    }
}
