
interface TvRemote{
	void click();
}
interface smartTvRemote extends TvRemote{
	void press();
}
class Tv implements smartTvRemote{
	public void press() {
		System.out.println("Pressing ....");
	}

	@Override
	public void click() {
			System.out.println("Clicking ....");
	}
}

public class tvremoteInterface {

	public static void main(String[] args) {
		TvRemote t1 = new Tv();
		t1.click();
		smartTvRemote t2 = new Tv();
		t2.press();
	}

}
