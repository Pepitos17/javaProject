package investmentEarning;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your buying price per share:");
        double buyingPrice = scan.nextDouble();
        int day = 1;
        double closingPrice = 0.1;
        DecimalFormat df = new DecimalFormat();
        while (true) {
            System.out.println("Enter the closing price for day "
                    + day + "(any negative value to leave: ");
            closingPrice = scan.nextDouble();
            if (closingPrice < 0.0) break;
            double earning = closingPrice - buyingPrice;
            if (earning > 0.0) {
                System.out.println("After day " + day + ", you earned "
                        + df.format(earning)+ " per share");
            } else if (earning < 0.0) {
                System.out.println("After day " + day + ", you earned "
                    + df.format(-earning)+ " per share");
            }
            else {
                System.out.println("After day " + day + ", you have "
                        + "no earning per share. ");
            }
            day += 1;

        }
    }
}
