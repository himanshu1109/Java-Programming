import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		int a,b,c,d;
		try (Scanner sc = new Scanner(System.in)) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
		}
		d = a+b+c;
		System.out.println(d);
	}

}
