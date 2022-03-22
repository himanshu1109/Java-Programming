import java.util.Scanner;

public class arithmeticIllegalException {

	public static int divide(int x , int y) {
		if(y<=0) {
			throw new IllegalArgumentException("Hehe");
		}
		return x/y;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			int result = divide(4,0);
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("Haha");
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
