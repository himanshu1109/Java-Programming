
public class tableMethod {
	static void table(int n) {
		int ta = 0;
		for(int i =1;i<=10;i++) {
			ta = i*n;
			System.out.println(n+" x "+i+" = "+ta);
		}
	}

	public static void main(String[] args) {
		table(10);
	}

}
