import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        int number, countPositive=0,countNegative=0,countZero=0;
        char c = 0;
        Scanner sc = new Scanner(System.in);
        while (c != 'y'){
            System.out.println("Enter a number ");
            number = sc.nextInt();
            if (number > 0) {
                countPositive++;
            }
            else if (number<0){
                countNegative ++;
            }
            else {
                countZero ++;
            }
            System.out.println("Do u want to exit ? y or n");
            c= sc.next().charAt(0);
        }
        System.out.println("Number of count positive : " + countPositive);
        System.out.println("Number of count negative : " + countNegative );
        System.out.println("Number of count Zero : " + countZero);
    }
}
