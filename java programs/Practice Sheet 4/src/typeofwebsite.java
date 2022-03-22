import java.util.Scanner;

public class typeofwebsite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String url = sc.next();
		if(url.endsWith(".org")){
			System.out.println("Organisational");
		}
		else if(url.endsWith(".in")){
			System.out.println("Indian");
		}
		else if(url.endsWith(".com")){
			System.out.println("Commercial");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
