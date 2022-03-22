import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;
        char c = 'y';
        do {
            int n = sc.nextInt();
            if(n>0){
                positive++;
            }
            else if(n<0){
                negative++;
            }
            else{
                zero++;
            }
            System.out.println("Do you want to add more :");
            c = sc.next().toLowerCase().charAt(0);
        }while(c=='y');
        System.out.println("No. of Positives are : "+positive);
        System.out.println("No. of Negatives are : "+negative);
        System.out.println("No. of Zeroes are : "+zero);
    }
}
