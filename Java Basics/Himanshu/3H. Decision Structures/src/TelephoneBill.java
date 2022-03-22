import java.util.Scanner;

public class TelephoneBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of calls : ");
        int calls = sc.nextInt();
        int minBill = 200;
        Double bill;
        if(calls<=100){
            System.out.println("Bill is : "+minBill);
        }
        else if(calls<=150){
            bill = minBill + 0.60*(calls-100);
            System.out.println("Bill is : "+bill);
        }
        else if(calls<=200){
            bill = minBill + 0.60*50 + 0.50*(calls-150);
            System.out.println("Bill is : "+bill);
        }
        else{
            bill = minBill + 0.60*50 + 0.50*50 + 0.40*(calls-200);
            System.out.println("Bill is : "+bill);
        }
    }
}
