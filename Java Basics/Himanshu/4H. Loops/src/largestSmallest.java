import java.util.Scanner;

public class largestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        char c = 'y';
        do{
            int n = sc.nextInt();
            if(n>largest){
                largest = n;
            }
            else if (n<smallest){
                smallest = n;
            }
            System.out.println("Do you want to add more : ");
            c = sc.next().toLowerCase().charAt(0);
        }while(c=='y');
        System.out.println("Largest : "+largest);
        System.out.println("Smallest : "+smallest);
    }
}
