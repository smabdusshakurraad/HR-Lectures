import java.util.Scanner;

//problem link:
// https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
public class SubstringCompare {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0;i<s.length()-k+1;i++){
            if(s.substring(i,i+k).compareTo(smallest) < 0 || smallest.equals("")){
                smallest = s.substring(i,i+k);
            }
            if(s.substring(i,i+k).compareTo(largest)>0){
                largest = s.substring(i,i+k);
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
