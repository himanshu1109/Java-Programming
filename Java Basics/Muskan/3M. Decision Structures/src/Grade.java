import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Grade");
        String g = sc.nextLine();

        if (g.equals("A") || g.equals("a")) {
            System.out.println("Excellent");
        }
        else if (g.equals("B") || g.equals("b")) {
            System.out.println("Good");
        }
        else if (g.equals("C") || g.equals("c")) {
            System.out.println("Average");
        }
        else if (g.equals("D") || g.equals("d")) {
            System.out.println("Deficient");
        }
        else if (g.equals("F") || g.equals("f")) {
            System.out.println("Failing");
        }
        else {
            System.out.println("Invalid Grade");
        }

    }
}
