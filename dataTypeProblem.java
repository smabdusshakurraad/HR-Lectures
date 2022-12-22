import java.util.Scanner;

public class dataTypeProblem {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(-128<=x && x<=127)System.out.println("* byte");
                //Complete the code
                if(-32768 <= x && x < 32768)System.out.println("* short");
                if(- Math.pow(2, 32)/2 <= x && x < Math.pow(2, 32)/2)System.out.println("* int");
                if(- Math.pow(2, 64)/2 <= x && x < Math.pow(2, 64)/2)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}

