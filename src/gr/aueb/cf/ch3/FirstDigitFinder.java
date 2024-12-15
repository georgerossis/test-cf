package gr.aueb.cf.ch3;
/**
 * βρίσκει το πρώτο αριστερό ψηφίο
 * ενός ακεραίου
 */

import java.util.Scanner;

public class FirstDigitFinder {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int i = 0;
        int tempNum = 0;

        System.out.println("Please insert a positive number");
        inputNum = in.nextInt();

        tempNum = inputNum;
        while (tempNum >= 10) {
            tempNum /=10;
        }

        System.out.println("The first digit of " + inputNum + " is " + tempNum);
    }
}
