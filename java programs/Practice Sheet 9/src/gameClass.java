import java.util.Random;
import java.util.Scanner;

class game{
	Scanner sc = new Scanner(System.in);
	Random ra = new Random();
	private int number;
	private int user;
	public game() {
		this.number = ra.nextInt(50);
	}
	public int takeUserInput() { 
		System.out.println("Enter your Choice : ");
		this.user = sc.nextInt();
		return user;
	}
	public boolean isCorrectNumber() {
			if(user==number) {
				System.out.println("you are correct");
				return true;
			}
			else if(user>number){
				System.out.println("your number is greater");
				return false;
			}
			else {
				System.out.println("your number is smaller");
				return false;
			}
	}
}

public class gameClass {

	public static void main(String[] args) {
		game gm = new game();
		gm.takeUserInput();
		boolean b = false;
		for(int i=1;i<=Integer.MAX_VALUE;i++) {
			if(gm.isCorrectNumber()==true) {
				System.out.println("No. of chances taken: "+i);
				break;
			}
			gm.takeUserInput();
		}
		}
}
