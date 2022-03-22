import java.util.Scanner;

public class DescendingNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name :");
        String first = sc.next();
        System.out.println("Enter Second Name :");
        String second = sc.next();
        System.out.println("Enter Third Name :");
        String third = sc.next();
        System.out.println("Names in Descending Order : ");
        if(first.compareTo(second)>0 && first.compareTo(third)>0){
            System.out.println(first);
            if(second.compareTo(third)>0){
                System.out.println(second);
                System.out.println(third);
            }
            else{
                System.out.println(third);
                System.out.println(second);
            }
        }
        else if(second.compareTo(first)>0 && second.compareTo(third)>0){
            System.out.println(second);
            if(first.compareTo(third)>0){
                System.out.println(first);
                System.out.println(third);
            }
            else{
                System.out.println(third);
                System.out.println(first);
            }
        }
        else{
            System.out.println(third);
            if(second.compareTo(first)>0){
                System.out.println(second);
                System.out.println(first);
            }
            else{
                System.out.println(first);
                System.out.println(second);
            }
        }
    }
}
