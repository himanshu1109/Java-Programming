import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maths Marks :");
        double M = sc.nextDouble();
        System.out.print("Enter Science Marks :");
        double S = sc.nextDouble();
        System.out.print("Enter English Marks :");
        double E = sc.nextDouble();

        double avg = (M+S+E)/3;
        System.out.println(avg);
        if (avg>=90){
            System.out.println("Grade : A");
        }
        else if (avg >=80 && avg<90){
            System.out.println("Grade : B");
        }
        else if (avg >=70 && avg<80){
            System.out.println("Grade : C");
        }
        else if (avg >=60 && avg<70){
            System.out.println("Grade : D");
        }
        else {
            System.out.println("Grade : F");
        }
    }
}
