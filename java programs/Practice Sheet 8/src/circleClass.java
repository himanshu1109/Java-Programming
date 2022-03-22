
class circle{
	int r;
	int radius() {
		return r;
	}
	float area() {
		float a = (float) ((3.14)*(Math.pow(r,2)));
		return a;
				
	}
	float perimeter() {
		float p = (float) (2*3.14*r);
		return p;
	}
}

public class circleClass {

	public static void main(String[] args) {
		circle ci = new circle();
		ci.r=3;
		System.out.println(ci.radius());
		System.out.println(ci.area());
		System.out.println(ci.perimeter());
	}

}
