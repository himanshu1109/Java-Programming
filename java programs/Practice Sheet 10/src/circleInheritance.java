
class circle{
	public int radius;
	public double ar;
	public final double pie = 3.14;
	public circle(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public double area() {
		ar = pie*radius*radius;
		return ar;
	}
}

class cylinder extends circle{
	public int height;
	public double v;
	public cylinder(int r,int h) {
		super(r);
		this.height = h;
	}
	@Override
	public double area() {
		ar = 2*pie*radius*(radius+height);
		return ar;
	}
	public double volume() {
		v = pie*radius*radius*height;
		return v;
	}
}
public class circleInheritance {

	public static void main(String[] args) {
		circle c1 = new cylinder(4,5);
		circle c2 = new circle(4);
		cylinder c3 = new cylinder(4,5);
		System.out.println(c1.area());
		System.out.println(c2.area());
		System.out.println(c3.area());
		System.out.println(((cylinder) c1).volume());
		System.out.println(c3.volume());
	}

}
