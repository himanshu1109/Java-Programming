import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int n;
		int fact=1;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
