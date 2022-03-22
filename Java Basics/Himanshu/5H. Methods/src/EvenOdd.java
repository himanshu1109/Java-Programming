import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isEven(num)){
            System.out.println(num + " is an Even Number.");
        }
        else{
            System.out.println(num + " is an Odd Number.");
        }
    }
    public static boolean isEven(int num){
        return num % 2 == 0;
    }
}
