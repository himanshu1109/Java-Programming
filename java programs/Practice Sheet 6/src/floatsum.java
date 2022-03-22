import java.util.Scanner;

public class floatsum {

	public static void main(String[] args) {
		float [] marks = new float[5];
		float sum=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=4;i++){
			marks[i] = sc.nextFloat();
			sum = sum+marks[i];
		}
		System.out.println(sum);
	}

}
