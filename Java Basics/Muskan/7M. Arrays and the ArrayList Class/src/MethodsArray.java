import java.util.Scanner;

public class MethodsArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean is_going = true;
        while(is_going) {
            System.out.println("a. Accepts elements in array");
            System.out.println("b. Display elements in array");
            System.out.println("c. Search elements in array");
            System.out.println("d. Sort elements in array");
            System.out.println("e. Exit");
            System.out.println("Enter your Choice : ");
            char choice = sc.next().toLowerCase().charAt(0);
            switch (choice){
                case 'a':
                    accept(arr);
                    continue;
                case 'b':
                    display(arr);
                    continue;
                case 'c':
                    System.out.println("Enter the element you want to search : ");
                    int x = sc.nextInt();
                    int y = search(arr, x);
                    if (y == -1){
                        System.out.println("Element not found");
                    }
                    else{
                        System.out.println("Element found at index : " + y);
                    }
                    continue;
                case 'd':
                    sort(arr);
                    System.out.println("The Array is sorted ! ");
                    continue;
                case 'e':
                    System.out.println("The Program is exited");
                    is_going = false;
                default:
                    System.out.println("Invalid Choice ! \nThe Program is ended!");
                    is_going = false;
            }
        }
    }

    public static  void accept(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements of the array : ");
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
    }

    public static void display(int[] arr){
        System.out.println("The Array is : ");
        for (int i=0;i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static int search(int[] arr, int n){
        for (int i=0;i<arr.length; i++){
            if (arr[i] == n){
                return i;
            }
        }
        return -1;
    }

    public static void sort(int[] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = 1;j<arr.length;j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
