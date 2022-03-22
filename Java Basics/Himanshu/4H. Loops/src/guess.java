import java.util.Random;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int computer = rand.nextInt(100)+1;
        System.out.println(computer);
        boolean is_guess = true;
        System.out.println("Guess Number between 1 and 100");
        while(is_guess){
            int guess = sc.nextInt();
            if(guess==computer){
                System.out.println("You got it !");
                is_guess = false;
            }
            else if (guess<computer){
                System.out.println("Too low! Try Again");
            }
            else{
                System.out.println("Too High! Try Again");
            }
        }
    }
}
