import java.util.Scanner;

public class Cgpa {

	public static void main(String[] args) {
		int a,b,c,d;
		try (Scanner sc = new Scanner(System.in)) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
		}
		d = (a+b+c)/3;
		if (d>=90) {
			System.out.println("10");
		}
		else {
			System.out.println("9");
		}
		

	}

}
