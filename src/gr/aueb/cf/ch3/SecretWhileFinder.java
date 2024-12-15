package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SecretWhileFinder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        final int SECRET = 12;
        boolean isSuccess = false;

        do {
            System.out.println("Insert a num to guess the secret");
            inputNum = in.nextInt();

            if (inputNum == SECRET) {
                System.out.println("Secret found!!!");
                isSuccess = true;
            } else {
                System.out.println("Try again!");
            }
        } while (!isSuccess);

    }
}
