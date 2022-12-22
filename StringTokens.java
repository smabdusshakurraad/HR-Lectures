import java.util.Scanner;

//problem link:
// https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        if(s.trim().length() != 0) {
            String[] arrayOfStrings = s.trim().split("[^A-Za-z]+");
            System.out.println(arrayOfStrings.length);
            for (String arrayOfString : arrayOfStrings) {
                System.out.println(arrayOfString);
            }
        }else{
            System.out.println("0");
        }
    }
}
