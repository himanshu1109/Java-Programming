import java.util.Scanner;

public class QuickSort {
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
        quickSort(arr,0,size-1);
        System.out.println();
        System.out.println("Sorted array is");
        for (int i=0; i<size ; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static int partition(int[] arr,int start, int end){
        int pivot = arr[end];
        int i = start-1;
        for (int j=start; j<=end-1 ; j++){
            if (pivot > arr[j]) {
                i++;
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }
        int swap = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swap;
        int z = i+1;
        return z;
    }
    public static void quickSort(int[] arr, int start, int end){
        if (start < end){
            int pi = partition(arr, start, end);

            quickSort(arr, start , pi-1);
            quickSort(arr, pi + 1, end);
        }
    }
}
