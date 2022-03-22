import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        System.out.println("Enter elements in array");
        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements in array are ");
        for (int i=0; i<size ; i++){
            System.out.print(arr[i] + " ");
        }
        selectionSort(arr);
        System.out.println();
        System.out.println("Sorted array is");
        for (int i=0; i<size ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            if (min != i) {
                int swap = arr[min];
                arr[min] = arr[i];
                arr[i] = swap;
            }
        }
    }
}
