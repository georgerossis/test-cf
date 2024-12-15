package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μεταρέπει ημέρες, ώρες, λεπτά, δευτερόλπετα
 * σε συνολικά δευτερόλεπτα. Ο χρήστης εισάγει τα δεδομένα
 */
public class DateTimeToSecondsConverter {

    public static void main(String[] args) {
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please give days");
        days = in.nextInt();
        System.out.println("Please give hours");
        hours = in.nextInt();
        System.out.println("Please give minutes");
        minutes = in.nextInt();
        System.out.println("Please give seconds");
        seconds = in.nextInt();
        sum = (days*86400) + (hours * 3600) + (minutes * 60) + seconds ;
        System.out.printf("The total seconds is %,d seconds", sum);

    }
}
