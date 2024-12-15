package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * υπολογίζει το άθροισμα των άρτιων από το 2
 * μέχρι το όριο που δίνει ο χρήστης
 */
public class SumOfEvens {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int inputNum = 0;
        int i = 2;

        System.out.println("Please insert upper limit");
        inputNum = in.nextInt();

        while (i <= inputNum) {
            sum += i;
            i += 2;
        }

        System.out.println("The sum of evens is: " + sum);
    }
}
