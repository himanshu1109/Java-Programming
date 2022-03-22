
class sphere{
	private int height;
	private int radius;
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
}

public class sphereClass {

	public static void main(String[] args) {
		sphere sp = new sphere();
		sp.setheight(48);
		sp.setradius(85);
		System.out.println(sp.getheight());
		System.out.println(sp.getradius());
	}

}
