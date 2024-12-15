package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * calculate the positives count
 */
public class Sentinel {

    public static void main(String[] args) {
        int i = 1;
        int positivesCount = 0;
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please insert a num");
        inputNum = in.nextInt();

        while (inputNum >= 0) {    //χρησιμοποιούμε σαν sentinel το inputNum ώστε να σταματήσει η while
            positivesCount++;
            System.out.println("Please insert a num");
            inputNum = in.nextInt();
        }

        System.out.println("Positives count: " + positivesCount);
    }
}