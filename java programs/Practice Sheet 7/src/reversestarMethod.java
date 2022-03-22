
public class reversestarMethod {
	static void star(int n) {
		if(n>0) {
			for(int i=0;i<n;i++) {
				System.out.print("*");
			}
			System.out.println();
			star(n-1);
		}
	}

	public static void main(String[] args) {
		star(4);
	}

}
