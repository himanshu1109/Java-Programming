import java.util.Scanner;

public class maximumminimum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements of array: ");
		int n =sc.nextInt();
		int [] ac = new int[n];
		System.out.println("The elements of array are: ");
		for(int i:ac) {
			ac[i]=sc.nextInt();
	}
		//int max = Integer.MAX_VALUE;
		//int min = Integer.MIN_VALUE;
		int max=0;
		int min=0;
		for(int i=0;i<n;i++) {
			if(max<ac[i]) {
				max = ac[i];
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(ac[i]>ac[j]) {
					min=ac[i];
					ac[i]=ac[j];
					ac[j]=min;
				}
			}
		}
		System.out.println("Max is: "+max);
		System.out.println("Min is: "+min);
}
}
