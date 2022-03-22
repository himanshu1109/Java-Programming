
public class fibonacciMethod {
	static int a=0,b=1,c=0;
	static int fibonacci(int n) {
		if(n>0) {
			c = a+b;
			a=b;
			b=c;
			fibonacci(n-1);
		}
		return c;
	}
		

	public static void main(String[] args) {
		//System.out.print("0 1");
		System.out.print(fibonacci(5));
	}

}
