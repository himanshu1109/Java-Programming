import java.util.Scanner;

public class TelephoneBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of calls");
        int n = sc.nextInt();
        int minBill = 200;
        if (n<=100){
            System.out.println(minBill);
        }
        else if (n>100 && n<=150){
            double bill1 = minBill + 0.6*(n-100);
            System.out.println(bill1);
        }
        else if (n>150 && n<=200){
            double bill2 = minBill + 0.6*(n-100) + 0.5*(n-150);
            System.out.println(bill2);
        }
        else {
            double finalBill = minBill + 0.6*(n-100) + 0.5*(n-150) + 0.4*(n-200);
            System.out.println(finalBill);
        }
    }
}
