package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * υπολογίζει το άθροισμα των ψηφίων ενός ακεραίου
 * πχ. το άθροισμα του 123 είναι 6
 */
public class SumOfDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int inputNum = 0;
        int tempNum = 0;
        int rightDigit = 0;

        System.out.println("Enter a positive integer");
        inputNum = in.nextInt();

        tempNum = inputNum;
        while (tempNum > 0) {
            rightDigit = tempNum % 10;
            sum += rightDigit;
            tempNum /=10;
        }


        System.out.printf("The sum of digits of %d is: %d",inputNum, sum);
    }
}
