import java.util.Scanner;

public class matrixadd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] ab = new int[2][3];
		int [][] bc = new int[2][3];
		int [][] ca = new int[2][3];
		int sum=0;
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				ab[i][j]=sc.nextInt();
				bc[i][j]=sc.nextInt();
				ca[i][j]=ab[i][j]+bc[i][j];
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(ab[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(bc[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(ca[i][j]+" ");
			}
			System.out.println();
		}
	}

}
