import java.util.Scanner;

public class studentpass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = (a+b+c)/3;
		if(d>=40 && a>=33 && b>=33 && c>=33)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}

}
