import java.util.Scanner;

public class doWhileSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = 'Y';
        int i = 0;
        do{
            System.out.println("Enter Two Numbers :");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum = x + y;
            System.out.println("The Sum is : " + sum);
            System.out.println("Do you want to add more : ");
            c = sc.next().toLowerCase().charAt(0);
            i++;
        }
        while(c=='y');
        System.out.println("The Program is Finished. \nYou did " + i + " calculations.");
    }
}
