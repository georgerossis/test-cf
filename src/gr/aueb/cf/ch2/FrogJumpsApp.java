package gr.aueb.cf.ch2;

import static java.lang.Math.ceil;

/**
 * X = 10
 * Y = 85
 * D = 30
 *
 *
 * Jumps = 3
 * 10 + 30 = 40
 * 40 + 30 = 70
 * 70 + 30 = 100
 */
public class FrogJumpsApp {
    public static void main(String[] args) {
        int start = 10;
        int target = 85;
        int hop = 30;
        int jumps = 0;

        jumps = (int) Math.ceil((target - start) / (double) hop);

        System.out.println("Jumps: " + jumps);
    }
}
