
class cellphone{
	void ring() {
		System.out.println("Ringing");
	}
	void vibr() {
		System.out.println("Vibrating");
	}
}

public class cellphoneClass {

	public static void main(String[] args) {
		cellphone cell = new cellphone();
		cell.ring();
		cell.vibr();
	}

}
