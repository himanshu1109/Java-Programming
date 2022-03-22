import java.util.Scanner;

public class MenuDriven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size of array");
        int m= sc.nextInt();
        System.out.println("Enter column size of array");
        int n= sc.nextInt();
        int[][] arr = new int[m][n];
        boolean is_going = true;
        while(is_going) {
            System.out.println("Menu Driven");
            System.out.println("1. input elements into matrix");
            System.out.println("2. display elements of matrix");
            System.out.println("3. Sum of all elements of matrix");
            System.out.println("4. display row-wise sum");
            System.out.println("5. display column-wise sum");
            System.out.println("6 create transpose of matrix");
            System.out.println("7. Exit");

            System.out.println("Enter a option u want : ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    input(arr, m, n);
                    continue;
                case 2:
                    display(arr);
                    continue;
                case 3:
                    sum(arr);
                    continue;
                case 4:
                    SumRow(arr);
                    continue;
                case 5:
                    SumColumn(arr);
                    continue;
                case 6:
                    transpose(arr);
                    continue;
                case 7:
                    System.out.println("The Program is exited");
                    is_going = false;
                default:
                    System.out.println("Invalid Choice ! \nThe Program is ended!");
                    is_going = false;
            }
        }
    }
    public static void input(int[][] arr, int m, int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in array");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }
    }
    public static void display(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void sum(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
    public static void SumRow(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        for (int i=0;i<m;i++){
            int SumRow = 0;
            for (int j=0;j<n;j++){
                SumRow += arr[i][j];
            }
            System.out.println("Sum of Row " + i + " : " + SumRow);
        }
    }
    public static void SumColumn(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < n; i++) {
            int SumColumn = 0;
            for (int j = 0; j < m; j++) {
                SumColumn += arr[j][i];
            }
            System.out.println("Sum of Column " + i + " : " + SumColumn);
        }
    }
    public static void transpose(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

}
