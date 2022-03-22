import java.util.Locale;
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next().toLowerCase();
        int count = 0;
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if(isVowel(c)){
                count++;
            }
        }
        System.out.println("No. of vowels in " + str + " is : " + count);
    }
    public static boolean isVowel(char c){
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }
}
