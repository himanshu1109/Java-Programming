import java.util.Scanner;

public class searchint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements of array: ");
		int n =sc.nextInt();
		int [] ac = new int[n];
		System.out.println("The elements of array are: ");
		for(int i=0;i<n;i++) {
			ac[i]=sc.nextInt();
		}
		System.out.println("Element the element to be searched: ");
		int x = sc.nextInt();
		int f=0;
		for(int i=0;i<n;i++) {
			if(ac[i]==x) {
				f=1;
				break;
			}
		}
		if(f==1) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Element not found");
		}
	}

}
