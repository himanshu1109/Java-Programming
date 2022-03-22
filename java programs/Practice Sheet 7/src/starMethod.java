
public class starMethod {
	static void star(int n) {
		if(n>0) {
			star(n-1);
			for(int i=0;i<n;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		star(4);
	}

}
