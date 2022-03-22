import java.util.Scanner;

public class greater {

	public static void main(String[] args) {
		int a = 87;
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		if (a>b) {
			System.out.println("Given Number is greater");
		}
		else {
			System.out.println("User Entered Number is greater");
		}
	}

}
