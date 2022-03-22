
public class convertcelsMethod {
	static double cels(double c) {
		double f;
		f = ((9/5d) *c)-32;
		return f;
	}

	public static void main(String[] args) {
		System.out.print(cels(10));
	}

}
