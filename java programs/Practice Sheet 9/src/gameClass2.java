import java.util.Random;
import java.util.Scanner;

class RPS{
	private int userno;
	private int number;
	private String numbers;
	Random ra = new Random();
	Scanner sc = new Scanner(System.in);
	public void n() {
		this.number = ra.nextInt(3);
		if (number == 0) {
			this.numbers = "Rock";
		}
		else if (number ==1) {
			this.numbers = "Scissor";
		}
		else {
			this.numbers = "Paper";
		}
	}
	public int takeUserInput() {
		System.out.print("Enter your choice : \n 0 for Rock \n 1 for Scissor \n 2 for Paper \n");
		this.userno = sc.nextInt();
		if (userno<0||userno>2) {
			System.out.println("Invalid Choice");
			takeUserInput();
		}
		return userno;
	}
	public int iscorrect() {
		if ((number==0 && userno==2)||(number==1 && userno==0)||(number==2 && userno==1)) {
			System.out.println("Computer Choice is : "+numbers);
			System.out.println("You won , computer lost");
			return 0;
		}
		else if ((number==0 && userno==1)||(number==1 && userno==2)||(number==2 && userno==0)) {
			System.out.println("Computer Choice is : "+numbers);
			System.out.println("You lost , computer won");
			return 1;
		}
		else {
			System.out.println("Computer Choice is : "+numbers);
			System.out.println("Draw");
			return 2;
		}
	}
}

public class gameClass2 {

	public static void main(String[] args) {
		RPS r1 = new RPS();
		int won = 0;
		int lost = 0;
		int draw = 0;
		for(int i=0;i<5;i++) {
			r1.n();
			r1.takeUserInput();
			if(r1.iscorrect()==0) {
				won = won+1;
			}
			else if (r1.iscorrect()==1) {
				lost = lost+1;
			}
			else {
				draw = draw+1;
			}
		}
		System.out.println("No. of wins : "+won);
		System.out.println("No. of loses : "+lost);
		System.out.println("No. of draws : "+draw);
		if(won>lost) {
			System.out.println("You won the series by :"+won+"-"+lost);
		}
		else if(won<lost) {
			System.out.println("You lost the series by : "+won+"-"+lost);
		}
		else {
			System.out.println("The Series is tied by : "+won+"-"+lost);
		}
	}

}
