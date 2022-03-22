import java.util.Scanner;

public class MiddleRowColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of squared array");
        int size= sc.nextInt();
        int[][] arr = new int[size][size];
        System.out.println("Enter elements in array");
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Matrix is : ");
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("elements in middle row are");
        for (int i=0;i<size;i++){
            for (int j=0; j<size;j++){
                if(i==size/2){
                    System.out.println(arr[i][j]);
                }
            }
        }
        System.out.println("elements in middle column are");
        for (int i=0;i<size;i++){
            for (int j=0; j<size;j++){
                if(j==size/2){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
