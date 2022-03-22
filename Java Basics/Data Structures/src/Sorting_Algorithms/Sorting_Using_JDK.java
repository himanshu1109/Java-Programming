package Sorting_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting_Using_JDK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of Elements of Array : ");
        int n = sc.nextInt();
        int[] intArray = new int[n];

        System.out.println("Enter the Elements : ");
        for(int i = 0;i<intArray.length;i++){
            intArray[i] = sc.nextInt();
        }

        Arrays.parallelSort(intArray);
        Arrays.sort(intArray);

        System.out.println("The Sorted Array is :");
        for(int j : intArray){
            System.out.print(" " + j);
        }
    }
}
