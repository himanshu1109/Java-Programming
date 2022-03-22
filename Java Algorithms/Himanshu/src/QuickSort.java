import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements of array : ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        int[] arr = newArray(size);
        System.out.println("The Original Array is : ");
        printArray(arr, size);
        quickSort(arr, 0, size-1);
        System.out.println("The Sorted Array is : ");
        printArray(arr, size);
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] newArray(int size){
        int[] arr = new int[size];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void printArray(int[] arr, int n){
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start-1;

        for(int j = start; j<=end-1; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, end);
        return (i+1);
    }

    static void quickSort(int[] arr, int start, int end){
        if (start<end){
            int pivot = partition(arr, start, end);

            quickSort(arr, start, pivot-1);
            quickSort(arr, pivot+1, end);
        }
    }
}
