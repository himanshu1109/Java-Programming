import java.util.Scanner;

public class CopyingArray {
    public static void main(String[] args) {
        int[] list1 = new int[5];
        int[] list2 = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements in array: ");
        for (int i=0;i<5;i++){
            list1[i]= sc.nextInt();
        }
        for (int i=0;i<5;i++){
            list2[i] = list1[i];
        }
        System.out.println("elements in list2 are : ");
        for (int i=0;i<5;i++){
            System.out.print(list2[i] + " ");
        }
    }
}
