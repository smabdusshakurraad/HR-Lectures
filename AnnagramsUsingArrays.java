import java.util.Arrays;
import java.util.Scanner;

//problem link: https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

public class AnnagramsUsingArrays {
    static boolean isAnagram(String a, String b) {
        a= a.toLowerCase();
        b = b.toLowerCase();
        // Complete the function
        if(a.length() == b.length()){
            char[] arrayOfA = a.toCharArray();
            char[] arrayOfB = b.toCharArray();

            Arrays.sort(arrayOfA);
            Arrays.sort(arrayOfB);

            return Arrays.equals(arrayOfA,arrayOfB);
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
