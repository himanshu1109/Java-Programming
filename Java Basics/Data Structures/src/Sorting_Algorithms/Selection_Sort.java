package Sorting_Algorithms;

import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of Elements of Array : ");
        int n = sc.nextInt();
        int[] intArray = new int[n];

        System.out.println("Enter the Elements : ");
        for(int i = 0;i<intArray.length;i++){
            intArray[i] = sc.nextInt();
        }

        for(int lastUnsortedIndex = intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            int largest = 0;

            for(int i = 1; i<=lastUnsortedIndex;i++){
                if(intArray[i]>intArray[largest]){
                    largest = i;
                }
            }

            swap(intArray,largest,lastUnsortedIndex);
        }

        System.out.println("The Sorted Array is :");
        for(int j : intArray){
            System.out.print(" " + j);
        }
    }

    public static void swap(int[] array, int i , int j){
        if(i==j){
            return;
        }

        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j]=temp;
    }
}
