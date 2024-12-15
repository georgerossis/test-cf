package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * δίνουμε τα πολλαπλάσια ενός ακεραίου
 * που δίνει ο χρήστης με όλους τους ακεραίους
 * απο 1 εως 10
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int i = 1;

        System.out.println("Please enter an integer");
        inputNum = in.nextInt();

        while (i <= 10) {
            System.out.println(inputNum + " * " + i + " = " + (inputNum * i));
            i++;
        }
    }
}
