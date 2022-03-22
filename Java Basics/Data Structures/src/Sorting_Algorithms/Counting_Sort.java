package Sorting_Algorithms;

import java.util.Scanner;

public class Counting_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of Elements of Array : ");
        int n = sc.nextInt();
        int[] intArray = new int[n];

        System.out.println("Enter the Elements : ");
        for(int i = 0;i<intArray.length;i++){
            intArray[i] = sc.nextInt();
        }

        countingSort(intArray,1,20);

        System.out.println("The Sorted Array is :");
        for(int j : intArray){
            System.out.print(" " + j);
        }
    }

    public static void countingSort(int[] input, int min, int max){
        int[] countArray = new int[(max-min) + 1];

        for(int i = 0; i<input.length; i++){
            countArray[input[i] - min]++;
        }

        int j = 0;
        for(int i = min; i<=max; i++){
            while(countArray[i-min]>0){
                input[j++] = i;
                countArray[i-min]--;
            }
        }
    }
}
