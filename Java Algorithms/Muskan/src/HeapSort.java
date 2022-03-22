import java.util.Scanner;

public class HeapSort {
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
        heapSort(arr);
        System.out.println();
        System.out.println("Sorted array is");
        for (int i=0; i<size ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void heapSort(int[] arr){
        BuildHeap(arr);
        int heapSize=arr.length;
        for (int i=arr.length-1; i>=0;i--){
            int swap = arr[0];
            arr[0]= arr[i];
            arr[i] = swap;
            heapSize--;
            Heapify(arr,heapSize,0);
        }

    }
    public static void BuildHeap(int[] arr){
        int heapSize = arr.length;
        for (int i=(heapSize/2)-1;i>=0;i--){
            Heapify(arr,heapSize,i);
        }

    }
    public static void Heapify(int[] arr,int n,int i){
        int left = 2*i+1;
        int right= 2*i+2;
        int largest=i;
        if (left<n && arr[left]>arr[largest]){
            largest = left;
        }
        if (right<n && arr[right]>arr[largest]){
            largest=right;
        }
        if(largest != i){
            int swap = arr[i];
            arr[i]=arr[largest];
            arr[largest] = swap;
            Heapify(arr,n,largest);
        }
    }
}
