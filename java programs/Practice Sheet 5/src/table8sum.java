import java.util.Scanner;

public class table8sum {

	public static void main(String[] args) {
		int n=8;
		int sum=0;
		for(int i =1;i<=10;i++) {
			int ta = i*n;
			System.out.println(n+" x "+i+" = "+ta);
			sum=sum+ta;
		}
		System.out.println(sum);
	}

}
