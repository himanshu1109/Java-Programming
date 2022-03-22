import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][6];
        System.out.println("Enter elements in array");

        for (int i=0;i<4;i++){
            for (int j=0;j<6;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Matrix is : ");
        for (int i=0;i<4;i++){
            for (int j=0;j<6;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i=0;i<4;i++){
            int multiplyRow = 1;
            for (int j=0;j<6;j++){
                multiplyRow*= arr[i][j];
            }
            System.out.println("Row : " + multiplyRow);
        }
        for (int i=0;i<6;i++){
            int multiplyColumn = 1;
            for (int j=0;j<4;j++){
                multiplyColumn*= arr[j][i];
            }
            System.out.println("Column : " + multiplyColumn);
        }

    }
}
