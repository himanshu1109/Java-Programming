import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 element in array: ");
        for (int i=0;i<10;i++){
            arr[i]= sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<10;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of array : " + sum);
    }
}
