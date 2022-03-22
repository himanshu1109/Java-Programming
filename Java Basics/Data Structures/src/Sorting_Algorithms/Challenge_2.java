package Sorting_Algorithms;

import java.util.Scanner;

public class Challenge_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of Elements of Array : ");
        int n = sc.nextInt();
        int[] intArray = new int[n];

        System.out.println("Enter the Elements : ");
        for(int i = 0;i<intArray.length;i++){
            intArray[i] = sc.nextInt();
        }

        insertionSort(intArray, intArray.length);

        System.out.println("The Sorted Array is :");
        for(int j : intArray){
            System.out.print(" " + j);
        }
    }

    public static void insertionSort(int[] input, int numItems){
        if(numItems<2){
            return;
        }

        insertionSort(input, numItems-1);
        int newElement = input[numItems-1];

        int i;
        for(i = numItems-1; i>0 && input[i-1]>newElement;i--){
            input[i] = input[i-1];
        }
        input[i] = newElement;

        System.out.println("Result of call when numItems = "+numItems);
        for(i=0; i< input.length; i++){
            System.out.print(input[i]);
            System.out.print(", ");
        }
        System.out.println("");
        System.out.println("---------------");
    }
}
