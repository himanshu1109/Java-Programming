import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {
		double a,v,u,q,s;
		Scanner sc = new Scanner(System.in);
		v = sc.nextDouble();
		u = sc.nextDouble();
		q = sc.nextDouble();
		s = sc.nextDouble();
		a = (Math.pow(v,2)-Math.pow(u,2))/(2*q*s);
		System.out.println(a);
	}

}
