import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int  z = 0;
        int highest = 0;
        if(x<y){
            z = x;
        }
        else{
            z = y;
        }
        for(int i = 1;i<=z;i++){
            if(x%i==0 && y%i==0){
                highest = i;
            }
        }
        System.out.println("HCF of " + x + " and " + y + " is : " + highest);
    }
}
