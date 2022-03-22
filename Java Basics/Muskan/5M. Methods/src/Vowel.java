import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to check no. of vowels :");
        String word = sc.nextLine().toLowerCase();
        int c=0;
        for(int i=0;i<word.length();i++){
            if (isVowel(word.charAt(i))){
                c++;
            }
        }
        System.out.println("No. of vowels in the word : " + c);
    }
    public static boolean isVowel(char w){
        if(w == 'a' || w=='e' || w=='i' || w=='o' || w=='u'){
            return true;
        }
        else {
            return  false;
        }
    }
}
