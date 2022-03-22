import java.util.Scanner;

public class evensum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		int even=0;
		for (int i=1;i<=n;i++) {
			even = even+2;
			sum = sum+even;
		}
		System.out.println(sum);
	}
}
