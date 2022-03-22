package Sorting_Algorithms;

import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of Elements of Array : ");
        int n = sc.nextInt();
        int[] intArray = new int[n];

        System.out.println("Enter the Elements : ");
        for(int i = 0;i<intArray.length;i++){
            intArray[i] = sc.nextInt();
        }

        //int[] intArray = {20,35,-15,7,55,1,-22};

        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex>0;lastUnsortedIndex--){
            for(int i = 0;i<lastUnsortedIndex;i++){
               if(intArray[i]>intArray[i+1]){
                   swap(intArray,i,i+1);
               }
            }
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
