import java.util.Scanner;

//problem link:
//https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true

public class JavaRegex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex{
    String pattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)." +
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)." +
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)." +
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
}
