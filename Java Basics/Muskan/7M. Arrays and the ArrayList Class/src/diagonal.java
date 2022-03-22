import java.util.Scanner;

public class diagonal {
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
        int sumLeft = 0;
        for (int i=0;i<size; i++){
            for (int j=0; j<size; j++){
                if (i==j){
                    sumLeft += arr[i][j];
                }
            }
        }
        System.out.println("Left Diagonal Sum is : "+sumLeft);
        int sumRight = 0;
        for (int i=0;i<size; i++){
            for (int j=0; j<size; j++){
                if ((i+j)== size-1 ){
                    sumRight += arr[i][j];
                }
            }
        }
        System.out.println("Right Diagonal Sum is : "+sumRight);
    }
}
