package Sorting_Algorithms;

import java.util.Scanner;

public class Shell_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of Elements of Array : ");
        int n = sc.nextInt();
        int[] intArray = new int[n];

        System.out.println("Enter the Elements : ");
        for(int i = 0;i<intArray.length;i++){
            intArray[i] = sc.nextInt();
        }

        for(int gap = intArray.length/2; gap>0; gap/=2){

            for(int i = gap; i < intArray.length; i++){
                int newElement = intArray[i];

                int j = i;
                while(j >= gap && intArray[j-gap] > newElement){
                    intArray[j] = intArray[j-gap];
                    j -= gap;
                }

                intArray[j] = newElement;
            }
        }

        System.out.println("The Sorted Array is :");
        for(int j : intArray){
            System.out.print(" " + j);
        }
    }
}
