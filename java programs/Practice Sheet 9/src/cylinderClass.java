
class cylinder{
	private int height;
	private int radius;
	final double pie = 3.14;
	public cylinder(int h , int r) {
		this.height = h;
		this.radius = r;
	}
	public void setheight(int h) {
		height = h;
	}
	public int getheight() {
		return height;
	}
	public int getradius() {
		return radius;
	}
	public void setradius(int r) {
		radius = r;
	}
	public double surfacearea() {
		double sa = (double)2*pie*radius*(radius+height);
		return sa;
	}
	public double volume() {
		double v = (double)pie*radius*radius*height;
		return v;
	}
}

public class cylinderClass {

	public static void main(String[] args) {
		cylinder cy = new cylinder(20,40);
		System.out.println(cy.getheight());
		System.out.println(cy.getradius());
		System.out.println(cy.surfacearea());
		System.out.println(cy.volume());
	}

}
