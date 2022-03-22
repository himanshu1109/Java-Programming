
abstract class TelePhone{
	abstract void ring();
	abstract void lift();
	abstract void disconnect();
}
class SmartPhone extends TelePhone{
	@Override
	public void ring() {
		System.out.println("Ringing ....");
	}
	@Override
	public void lift() {
		System.out.println("Lifting ....");
	}
	@Override
	public void disconnect() {
		System.out.println("Disconnecting ....");
	}
	public void music() {
		System.out.println("Playing the music ....");
	}
}

public class telephoneClass {

	public static void main(String[] args) {
		TelePhone p1 = new SmartPhone();
		p1.disconnect();
		SmartPhone p2 = new SmartPhone();
		p2.music();
		p2.lift();
		p2.ring();
	}

}
