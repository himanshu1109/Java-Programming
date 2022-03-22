import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if (isPalindrome(num)){
            System.out.println(num + " is palindrome");
        }
        else {
            System.out.println(num + " is not palindrome");
        }
    }
    public static boolean isPalindrome(int n){
        int copy=n;
        int rem;
        int p=0;
        while (copy!=0){
            rem=copy%10;
            p=p*10+rem;
            copy = copy/10;
        }
        if (p==n){
            return true;
        }
        else{
            return false;
        }
    }
}
