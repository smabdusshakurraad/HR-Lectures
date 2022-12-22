import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

// problem link: https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat r = NumberFormat.getNumberInstance();
        r.setMaximumFractionDigits(2);
        r.setMinimumFractionDigits(2);

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india ="Rs."+ r.format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
