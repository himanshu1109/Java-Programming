package Sorting_Algorithms;

public class Recursion {
    public static void main(String[] args) {
        int Result1 = recursiveFactorial(5);
        int Result2 = iterativeFactorial(5);
        System.out.println("Using Recursive Approach , Factorial is : " + Result1);
        System.out.println("Using Iterative Approach , Factorial is : " + Result2);
    }

    public static int recursiveFactorial(int num){
        if(num == 0){
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }

    public static int iterativeFactorial(int num){
        if(num  == 0){
            return 1;
        }

        int factorial = 1;
        for(int i =1; i<=num; i++){
            factorial *= i;
        }

        return factorial;
    }
}
