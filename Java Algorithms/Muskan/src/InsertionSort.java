import java.util.Scanner;

public class InsertionSort {
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
        insertionSort(arr);
        System.out.println();
        System.out.println("Sorted array is");
        for (int i=0; i<size ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void insertionSort(int[] arr){
        for (int j=1;j<arr.length;j++){
            int key = arr[j];
            int i = j-1;
            while (i>=0 && arr[i]>key){
                arr[i+1] = arr[i];
                i = i-1;
            }
            arr[i+1] = key;
        }
    }
}
