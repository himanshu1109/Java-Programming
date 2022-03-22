
public class template {

	public static void main(String[] args) {
		String s = new String("Dear <|name|>, Thanks a lot!");
		System.out.println(s);
		System.out.println(s.replace("<|name|>", "Himanshu"));
	}

}
