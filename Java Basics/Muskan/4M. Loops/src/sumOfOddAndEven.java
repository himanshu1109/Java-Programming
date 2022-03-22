import java.util.Scanner;

public class sumOfOddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        char is_next = 'Y';
        int num = 0;
        do{
            System.out.println("Enter the number :");
            num = sc.nextInt();
            if(num%2==0){
                evenSum += num;
            }
            else{
                oddSum += num;
            }
            System.out.println("Do you want to enter more : ");
            is_next = sc.next().charAt(0);
        }
        while(is_next=='Y' || is_next=='y');
        System.out.println("Sum of Even Numbers : "+evenSum);
        System.out.println("Sum of Odd Numbers : "+oddSum);
    }
}
