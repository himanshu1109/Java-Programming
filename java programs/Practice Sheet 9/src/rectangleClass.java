
class rectangle{
	private int length;
	private int breadth;
	private int height;
	public rectangle(int l, int b) {
		this.length = l;
		this.breadth =b;
	}
	public rectangle(int l, int b, int h) {
		this.length = l;
		this.breadth = b;
		this.height = h;
	}
	public int getlength() {
		return length;
	}
	public int getbreadth() {
		return breadth;
	}
	public int getheight() {
		return height;
	}
}

public class rectangleClass {

	public static void main(String[] args) {
		rectangle r1 = new rectangle(4,5);
		rectangle r2 = new rectangle(3,4,6);
		System.out.println(r1.getlength());
		System.out.println(r1.getbreadth());
		System.out.println(r1.getheight());
		System.out.println(r2.getlength());
		System.out.println(r2.getbreadth());
		System.out.println(r2.getheight());
	}

}
