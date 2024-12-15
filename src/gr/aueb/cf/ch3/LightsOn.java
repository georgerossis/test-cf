package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on
 * if it is raining AND car is running (>100) OR is dark
 */
public class LightsOn {

    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isDark = false;
        int speed = 0;
        boolean lightsOn = false;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert the speed of the car");
        speed = in.nextInt();

        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();

        lightsOn = isRaining && (speed > 100 || isDark);

        System.out.println("Turn lights on: " + lightsOn);

    }
}
