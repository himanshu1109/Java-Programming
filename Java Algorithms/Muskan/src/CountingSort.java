import java.util.Scanner;

public class CountingSort {
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
        countingSort(arr,100);
        System.out.println();
        System.out.println("Sorted array is");
        for (int i=0; i<size ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void countingSort(int[] arr,int max){
        int size = arr.length;
        int[] count = new int[max+1];
        int[] output = new int[size];
        for(int i=0;i<max+1;i++){
            count[i]=0;
        }
        for (int i=0;i<size;i++){
            count[arr[i]] += 1;
        }
        for(int i=1;i<max+1;i++){
            count[i] += count[i-1];
        }
        for(int i=size-1;i>=0;i--){
            count[arr[i]] -= 1;
            output[count[arr[i]]] = arr[i];
         }
        for (int i=0;i<size;i++){
            arr[i]= output[i];
        }
    }
}
