import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);
        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case'D':
                System.out.println("Deficient");
                break;
            case 'F':
                System.out.println("Failing");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
