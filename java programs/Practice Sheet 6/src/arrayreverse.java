import java.util.Scanner;

public class arrayreverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements of array: ");
		int n =sc.nextInt();
		int [] ac = new int[n];
		System.out.println("The elements of array are: ");
		for(int i=0;i<n;i++) {
			ac[i]=sc.nextInt();
		}
		System.out.print("{ ");
		for(int i=0;i<n;i++) {
			System.out.print(ac[i]+", ");
		}
		System.out.print(" }");
		System.out.println();
		System.out.print("{ ");
		for(int i=n-1;i>=0;i--) {
			System.out.print(ac[i]+", ");
		}
		System.out.print(" }");
	}
}
