import java.util.Scanner;

//problem link: https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reverse = "";
        /* Enter your code here. Print output to STDOUT. */
        for(int i=(A.length()-1);i>=0;i--){
            reverse += A.charAt(i);
        }
        if(A.equals(reverse)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}