import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int c = -1;
		int a = 0;
		for(int y=1;y<=T;y++) {
			String S = sc.next();
			for(int i=0;i<S.length();i++) {
				for(int j=i+1;j<S.length();j++) {
					if(S.charAt(i)==S.charAt(j)) {
						String p = S.substring(i+1,j);
						a=p.length();
						if(a>c) {
							c = a;
						}
					}
				}
			}
			System.out.println(c);
		}
	}

}
