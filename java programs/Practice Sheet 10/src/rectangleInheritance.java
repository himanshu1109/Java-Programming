
class rectangle{
	public int length;
	public int breadth;
	public int ar;
	public final double pie = 3.14;
	public rectangle(int length,int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public int getlength() {
		return length;
	}
	public int getbreadth() {
		return breadth;
	}
	public int area() {
		ar = length*breadth;
		return ar;
	}
}

class cuboid extends rectangle{
	public int height;
	public int v;
	public cuboid(int l,int b,int h) {
		super(l,b);
		this.height = h;
	}
	@Override
	public int area() {
		ar = 2*(length*breadth + breadth*height + height*length);
		return ar;
	}
	public int volume() {
		v = length*breadth*height;
		return v;
	}
}

public class rectangleInheritance {

	public static void main(String[] args) {
		rectangle c1 = new cuboid(4,5,6);
		rectangle c2 = new rectangle(4,5);
		cuboid c3 = new cuboid(4,5,6);
		System.out.println(c1.area());
		System.out.println(c2.area());
		System.out.println(c3.area());
		System.out.println(((cuboid) c1).volume());
		System.out.println(c3.volume());
	}

}
