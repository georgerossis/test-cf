package gr.aueb.cf.ch3;


import java.util.Scanner;

/**
 * linearize the branches and checks for errors
 */
public class SecretFinderErrorHandling {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        final int SECRET = 12;
        boolean isSuccess = false;

        while (true) {
            System.out.println("Insert a num to guess the secret");
            inputNum = in.nextInt();

            if (inputNum != SECRET) {
                System.out.println("Try again");
                continue;
            }

            System.out.println("Kudos");
            break;
        }
    }
}
