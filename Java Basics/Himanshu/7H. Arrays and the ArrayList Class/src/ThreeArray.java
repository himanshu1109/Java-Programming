import java.util.Arrays;
import java.util.Scanner;

public class ThreeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements you want in first array");
        int p = sc.nextInt();
        int[] a = new int[p];
        System.out.println("Enter elements in ascending order");
        for (int i = 0; i < p; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter number of elements you want in second array");
        int q = sc.nextInt();
        int[] b = new int[q];
        System.out.println("Enter elements in descending order");
        for (int i = 0; i < q; i++) {
            b[i] = sc.nextInt();
        }
        int r = p + q;
        int[] c = new int[r];

        int z=0;
        for (int element : a){
            c[z]=element;
            z++;
        }
        for (int element : b){
            c[z]=element;
            z++;
        }
        Arrays.sort(c);
        System.out.println("element in 3rd array are: ");
        for (int i=0;i<r; i++){
            System.out.print(c[i] + " ");
        }
    }
}
