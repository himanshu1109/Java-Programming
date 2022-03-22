import java.util.Scanner;

public class sortedarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements of array: ");
		int n =sc.nextInt();
		int [] ac = new int[n];
		System.out.println("The elements of array are: ");
		for(int i=0;i<n;i++) {
			ac[i]=sc.nextInt();
		}
		int f=0;
		for(int i=0;i<n-1;i++) {
			if(ac[i]>ac[i+1]) {
				f=1;
			}
		}
		if(f==1) {
			System.out.println("Array is not sorted");
		}
		else {
			System.out.println("Array is sorted");
		}
	}

}
