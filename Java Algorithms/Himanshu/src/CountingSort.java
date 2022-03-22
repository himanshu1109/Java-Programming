import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements of array : ");
        int size = sc.nextInt();
        System.out.println("Enter max limit of array : ");
        int max = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        int[] arr = newArray(size);
        System.out.println("The Original Array is : ");
        printArray(arr, size);
        countingSort(arr, max);
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

    static void countingSort(int[] arr, int max){
        int size = arr.length;
        int[] count = new int[max+1];
        int[] output = new int[size];
        for (int i=0; i<max+1; i++){
            count[i] = 0;
        }
        for (int i=0; i<size; i++){
            count[arr[i]] += 1;
        }
        for (int i=1;i<max+1;i++){
            count[i] += count[i-1];
        }
        for (int i=size-1;i>=0;i--){
            count[arr[i]] -= 1;
            output[count[arr[i]]] = arr[i];
        }
        for (int i=0;i<size;i++){
            arr[i] = output[i];
        }
    }
}
