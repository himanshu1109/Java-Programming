package Sorting_Algorithms;

import java.util.Scanner;

public class Radix_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of Elements of Array : ");
        int n = sc.nextInt();
        int[] radixArray = new int[n];

        System.out.println("Enter the Elements : ");
        for(int i = 0;i<radixArray.length;i++){
            radixArray[i] = sc.nextInt();
        }

        radixSort(radixArray, 10, 4);

        System.out.println("The Sorted Array is :");
        for(int j : radixArray){
            System.out.print(" " + j);
        }
    }

    public static void radixSort(int[] input, int radix, int width){
        for(int i = 0; i<width; i++){
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix){
        int numItems = input.length;;
        int[] countArray = new int[radix];

        for(int value: input){
            countArray[getDigit(position, value, radix)]++;
        }

        //Adjust the count Array
        for(int j = 1; j<radix; j++){
            countArray[j] += countArray[j-1];
        }

        int[] temp = new int[numItems];
        for(int tempIndex = numItems-1; tempIndex>=0; tempIndex--){
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        for(int tempIndex = 0; tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static int getDigit(int position, int value, int radix){
        return value/(int) Math.pow(radix, position) % radix;
    }
}
