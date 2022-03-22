
abstract class pen{
	abstract void write();
	abstract void refill();
}
class fountainPen extends pen{
	@Override
	public void write() {
		System.out.println("Writing ....");
	}
	@Override
	public void refill() {
		System.out.println("Refilling ....");
	}
	public void changeNib() {
		System.out.println("Changing the Nib ....");
	}
}

public class penAbstract {

	public static void main(String[] args) {
		pen p1 = new fountainPen();
		p1.refill();
		p1.write();
		fountainPen p2 = new fountainPen();
		p2.changeNib();
		p2.write();
		p2.refill();
	}

}
