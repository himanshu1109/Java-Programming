import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements of array: ");
		int n =sc.nextInt();
		int [] ac = new int[n];
		int sum=0;
		System.out.println("The elements of array are: ");
		for(int i:ac) {
			ac[i]=sc.nextInt();
			sum += ac[i];
		}
		float average = (float)sum/n;
		System.out.println("the average is: "+average);
	}

}
