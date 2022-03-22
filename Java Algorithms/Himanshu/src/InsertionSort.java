import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements of array : ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        int[] arr = newArray(size);
        System.out.println("The Original Array is : ");
        printArray(arr, size);
        insertionSort(arr, size);
        System.out.println("The Sorted Array is : ");
        printArray(arr, size);
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

    static void insertionSort(int[] arr, int size){
        for (int j=1; j<size; j++){
            int key = arr[j];
            int i = j-1;
            while(i>=0 && arr[i]>key){
                arr[i+1] = arr[i];
                i -= 1;
            }
            arr[i+1] = key;
        }
    }
}
