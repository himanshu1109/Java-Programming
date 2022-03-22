package Sorting_Algorithms;

import java.util.Scanner;

public class Quick_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of Elements of Array : ");
        int n = sc.nextInt();
        int[] intArray = new int[n];

        System.out.println("Enter the Elements : ");
        for(int i = 0;i<intArray.length;i++){
            intArray[i] = sc.nextInt();
        }

        quickSort(intArray,0, intArray.length);

        System.out.println("The Sorted Array is :");
        for(int j : intArray){
            System.out.print(" " + j);
        }
    }

    public static void quickSort(int[] input, int start, int end){
        if(end-start<2){
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex+1 , end);
    }

    public static int partition(int[] input, int start, int end){
        int pivot = input[start];
        int i = start;
        int j = end;

        while(i<j){

            while(i<j && input[--j] >= pivot);
            if(i<j){
                input[i] = input[j];
            }

            while(i<j && input[++i] <= pivot);
            if(i<j){
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }
}
