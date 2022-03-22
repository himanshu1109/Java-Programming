import java.util.Scanner;

public class HourMinSec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds");
        int sec = sc.nextInt();
        int hour = Math.floorDiv(sec,3600);
        int min =(sec % 3600) ;
        int m = Math.floorDiv(min,60);
        int second = (sec % 3600)%60;
        System.out.println("hour :" +hour);
        System.out.println("minutes :" + m);
        System.out.println("seconds :" + second);

    }
}
