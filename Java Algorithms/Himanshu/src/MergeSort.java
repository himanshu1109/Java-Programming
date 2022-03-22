import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements of array : ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        int[] arr = newArray(size);
        System.out.println("The Original Array is : ");
        printArray(arr, size);
        mergeSort(arr, 0, size-1);
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

    static void merge(int[] arr, int start, int middle, int end){
        int n1 = middle-start+1;
        int n2 = end-middle;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i=0;i<n1;i++){
            L[i] = arr[start+i];
        }
        for (int j=0;j<n2;j++){
            R[j] = arr[middle+1+j];
        }
        int i=0, j=0;
        int k=start;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    static void mergeSort(int[] arr, int start, int end){
        if(start<end){
            int middle = (start + end)/2;
            mergeSort(arr, start, middle);
            mergeSort(arr, middle+1, end);
            merge(arr, start, middle, end);
        }
    }
}
