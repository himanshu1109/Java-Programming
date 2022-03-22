import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        int num;
        boolean is_guess=true;
        Scanner sc = new Scanner(System.in);
        num = (int) (Math.random()*100) +1;
        while (is_guess) {
            System.out.println("Guess a number : ");
            int guess = sc.nextInt();
            if (guess == num) {
                System.out.println("U got the number!! Hurray!!!!!");
                is_guess = false;
            }
            else if (guess>num) {
                System.out.println("Number is too high");
            }
            else {
                System.out.println("Number is too low");
            }
        }
    }
}
