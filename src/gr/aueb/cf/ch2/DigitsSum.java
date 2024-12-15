package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Θα λαμβάνει από τον χρήστη έναν δηψήφιο ακέραιο
 * και θα εκτυπώνει το άθροισμα των ψηφίων του.
 * πχ αν ο χρήστης δώσει τον αριθμό 15
 * θα πρέπει το αποτέλεσμα να είναι 1 + 5 = 6
 */
public class DigitsSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int leftDigit = 0;
        int rightDigit = 0;
        int inputNum;
        int sum = 0;
        System.out.println("Please insert two-digit integer");
        inputNum = in.nextInt();

        leftDigit = inputNum / 10; //με div 10 παίρνουμε το αριστερό ψηφίο
        rightDigit = inputNum % 10; //με mod 10 παίρνουμε το δεξί ψηφίο
        sum = leftDigit + rightDigit;

        System.out.printf("%d + %d = %d", leftDigit, rightDigit, sum);

    }
}
