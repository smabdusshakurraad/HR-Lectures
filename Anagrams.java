import java.util.Scanner;

//problem link: https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        int characterRange = 256;
        a= a.toLowerCase();
        b = b.toLowerCase();
        // Complete the function
        if(a.length() != b.length()){
            return false;
        }
        int count[] = new int[characterRange];

        for(int i= 0;i<a.length();i++){
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }

        for(int i=0;i<characterRange;i++){
            if(count[i] != 0){
                return false;
            }
        }

        return true;
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
