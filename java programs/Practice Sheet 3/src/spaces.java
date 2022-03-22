
public class spaces {

	public static void main(String[] args) {
		String s = new String("This contains     double    and triple spaces");
		System.out.println(s.indexOf("  "));
		System.out.println(s.indexOf("   "));
	}

}
