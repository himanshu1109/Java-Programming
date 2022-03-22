package Sorting_Algorithms;

import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of Elements of Array : ");
        int n = sc.nextInt();
        int[] intArray = new int[n];

        System.out.println("Enter the Elements : ");
        for(int i = 0;i<intArray.length;i++){
            intArray[i] = sc.nextInt();
        }

        for(int firstUnsortedIndex = 1; firstUnsortedIndex<intArray.length; firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];

            int i;
            for(i = firstUnsortedIndex; i>0 && intArray[i-1]>newElement;i--){
                intArray[i] = intArray[i-1];
            }

            intArray[i] = newElement;
        }

        System.out.println("The Sorted Array is :");
        for(int j : intArray){
            System.out.print(" " + j);
        }
    }
}
