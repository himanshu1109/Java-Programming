import java.util.Scanner;

public class evenwhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		int even=0;
		int i=1;
		while (i<=n) {
			even = even+2;
			sum = sum+even;
			i++;
		}
		System.out.println(sum);
	}

}
