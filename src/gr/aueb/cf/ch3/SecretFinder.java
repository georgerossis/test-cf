package gr.aueb.cf.ch3;


import java.util.Scanner;

/**
 * Υπάρχει ένα SECRET που είναι integer
 * και ο χρήστης με μία μονο προσπάθεια,
 * θα προσπαθήσει να τον βρει
 * */
public class SecretFinder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        final int SECRET = 12;

        System.out.println("Insert a num to guess the secret");
        inputNum = in.nextInt();

        if (inputNum == SECRET) {
            System.out.println("Secret found!!!");
        } else {
            System.out.println("Failure!!!");
        }
    }
}
