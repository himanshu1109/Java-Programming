import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter " + s +" elements in array");
        for (int i =0;i<s;i++){
            arr[i]= sc.nextInt();
        }
        int max=arr[1];
        for (int i =0;i<s;i++){
            if( arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max value is : " + max);
        int min=arr[1];
        for (int i =0;i<s;i++){
            if( arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min value is : " + min);

    }
}
