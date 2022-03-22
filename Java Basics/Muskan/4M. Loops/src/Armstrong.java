import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.print("Armstrong values are : " );
        for(int i=1;i<500;i++) {
            int num=i;
            int arm=0;
            while(num != 0){
                int rem = num %10;
                num=num/10;
                arm += Math.pow(rem,3);
            }
            if (arm==i) {
                System.out.print(" " + i);
            }
        }
    }
}
