
class square{
	int s;
	int side() {
		return s;
	}
	int area() {
		return s*s;
	}
	int perimeter() {
		return 4*s;
	}
}

public class squareClass {

	public static void main(String[] args) {
		square sq = new square();
		sq.s=20;
		System.out.println(sq.side());
		System.out.println(sq.area());
		System.out.println(sq.perimeter());
	}

}
