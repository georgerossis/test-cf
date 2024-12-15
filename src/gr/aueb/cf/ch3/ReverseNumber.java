package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * αντιστρέφει έναν ακέραιο
 * πχ το 123 γίνεται 321
 */
public class ReverseNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int reversed = 0;
        int tempNum = 0;
        int rightDigit = 0;

        System.out.println("Please give a positive integer");
        inputNum = in.nextInt();

        tempNum = inputNum;
        while (tempNum > 0) {
            rightDigit = tempNum % 10;
            reversed = reversed * 10 + rightDigit;
            tempNum /= 10;
        }

        System.out.println("the reversed number of " + inputNum + " is " + reversed);
    }
}
