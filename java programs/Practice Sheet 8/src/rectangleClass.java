
class rectangle{
	int b,l;
	int length() {
		return l;
	}
	int breadth() {
		return b;
	}
	int area() {
		return l*b;
	}
	int perimeter() {
		return (2*l + 2*b);
	}
}

public class rectangleClass {

	public static void main(String[] args) {
		rectangle re = new rectangle();
		re.l=20;
		re.b=40;
		System.out.println(re.length()+" "+re.breadth());
		System.out.println(re.area());
		System.out.println(re.perimeter());
	}

}
