import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements of array : ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        int[] arr = newArray(size);
        System.out.println("The Original Array is : ");
        printArray(arr, size);
        heapSort(arr);
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

    static void heapSort(int[] arr){
        BuildHeap(arr);
        for (int i = arr.length-1; i>0; i--){
            swap(arr, 0, i);
            Heapify(arr, i,0);
        }
    }

    static void BuildHeap(int[] arr){
        int length = arr.length;
        for (int i=(length/2)-1; i>=0; i--){
            Heapify(arr, length, i);
        }
    }

    static void Heapify(int[] arr, int n, int i){
        int largest = i;
        int le = 2*i + 1;
        int ri = 2*i + 2;
        if (le<n && arr[le]> arr[largest]){
            largest = le;
        }
        if (ri<n && arr[ri] > arr[largest]){
            largest = ri;
        }
        if (largest != i){
            swap(arr, i, largest);
            Heapify(arr, n, largest);
        }
    }
}
