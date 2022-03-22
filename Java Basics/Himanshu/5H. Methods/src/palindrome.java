import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome Number.");
        }
        else{
            System.out.println(num + " is not a Palindrome Number.");
        }
    }
    public static boolean isPalindrome(int num){
        int copy = num;
        int reverse = 0;
        while(num!=0){
            int remainder = num%10;
            num=num/10;
            reverse = reverse*10 + remainder;
        }
        if(reverse==copy){
            return true;
        }
        else{
            return false;
        }
    }
}
