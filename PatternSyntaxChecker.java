import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * problem link:
 * https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?isFullScreen=true
 */

public class PatternSyntaxChecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(PatternSyntaxException pe){
                System.out.println("Invalid");
            }

            testCases--;
        }

        String pattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)." +
                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)." +
                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    }
}
