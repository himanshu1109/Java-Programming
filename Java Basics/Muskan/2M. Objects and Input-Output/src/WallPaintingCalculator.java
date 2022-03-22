import java.util.Scanner;

public class WallPaintingCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length ");
        double length = sc.nextDouble();

        System.out.println("Enter width ");
        double width = sc.nextDouble();

        System.out.println("Enter height ");
        double height = sc.nextDouble();

        System.out.println("Enter number of doors");
        int noOfDoors = sc.nextInt();

        System.out.println("Enter number of windows");
        int noOfWindows = sc.nextInt();

        double totalSurfaceArea = 2*(length*width + width*height + height*length);
        double areaOfFloor =  (length*width);
        int areaOfDoor = noOfDoors*20;
        int areaOfWindow = noOfWindows*15;
        double totalPaintArea = totalSurfaceArea-areaOfDoor-areaOfFloor-areaOfWindow;
        double paintRequired = totalPaintArea/350;
        System.out.println("paint needed " + paintRequired + " gallons");
    }
}
