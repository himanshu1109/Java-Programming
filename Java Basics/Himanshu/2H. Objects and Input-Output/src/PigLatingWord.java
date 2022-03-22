import java.util.Scanner;

public class PigLatingWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = sc.nextLine();
        System.out.println(s.substring(1) + s.substring(0,1) + "ay");
    }
}
