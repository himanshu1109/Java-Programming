package Sorting_Algorithms;

import java.util.Scanner;

public class Challenge_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of Elements of Array : ");
        int n = sc.nextInt();
        int[] intArray = new int[n];

        System.out.println("Enter the Elements : ");
        for(int i = 0;i<intArray.length;i++){
            intArray[i] = sc.nextInt();
        }

        mergeSort(intArray,0, intArray.length);

        System.out.println("The Sorted Array is :");
        for(int j : intArray){
            System.out.print(" " + j);
        }
    }

    public static void mergeSort(int[] input, int start, int end){
        if(end-start<2){
            return;
        }

        int mid = (start+end)/2;
        mergeSort(input,start,mid);
        mergeSort(input,mid,end);
        merge(input,start,mid,end);
    }

    public static void merge(int[] input, int start, int mid, int end){
        if(input[mid-1] >= input[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end-start];
        while(i<mid && j<end){
            temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input,i,input,start+tempIndex,mid-i);
        System.arraycopy(temp,0,input,start,tempIndex);
    }
}
