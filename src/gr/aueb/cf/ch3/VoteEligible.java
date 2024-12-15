package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ελέγχει αν κάποιος έχει δικαίωμα να ψηφίσει
 * ηλικία > 18
 */
public class VoteEligible {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int VOTING_AGE = 18;
        int inputAge = 0;
        boolean isEligible = false;

        System.out.println("Please insert age");
        inputAge = in.nextInt();

        isEligible = inputAge > VOTING_AGE;

        System.out.printf("You are eligible: %b", isEligible);
    }
}
