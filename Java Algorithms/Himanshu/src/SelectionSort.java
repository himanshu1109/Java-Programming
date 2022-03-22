import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements of array : ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        int[] arr = newArray(size);
        System.out.println("The Original Array is : ");
        printArray(arr, size);
        selectionSort(arr, size);
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

    static void selectionSort(int[] arr, int size){
        for (int i=0; i<size-1;i++){
            int min = i;
            for (int j=i+1;j<size;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if (min!=i){
                swap(arr, min, i);
            }
        }
    }
}
