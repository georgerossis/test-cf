package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the price with Vat 24%
 */
public class PriceWithVat {
    public static void main(String[] args) {
        final double VAT = 0.24;
        double price = 0.0;
        double finalPrice = 0.0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert price");
        price = in.nextDouble();
        finalPrice = (price * VAT) + price;

        System.out.printf("The final price of %.2f, is %.2f", price, finalPrice);
    }
}
