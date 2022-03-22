
public class sumnaturalMethod {
	static int sum(int n) {
		int x= 0;
		if(n==1) {
			return 1;
		}
		else {
			return (x=n+sum(n-1));
		}
	}

	public static void main(String[] args) {
		System.out.println(sum(10));
	}

}
