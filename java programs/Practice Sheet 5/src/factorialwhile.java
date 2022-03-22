import java.util.Scanner;

public class factorialwhile {

	public static void main(String[] args) {
		int n;
		int fact=1;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int i=n;
		while(i>1) {
			fact = fact*i;
			i--;
		}
		System.out.println(fact);
	}

}
