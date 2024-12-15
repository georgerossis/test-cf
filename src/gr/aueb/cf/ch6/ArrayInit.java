package gr.aueb.cf.ch6;

/**
 * Δήλωση και αρχικοποίηση εός πίνακα.
 * Populate ένα πίνακα.
 * -new
 * -unsized init
 * -array initializer
 * print τα στοιχεία ενός πίνακα
 */
public class ArrayInit {

    public static void main(String[] args) {
        int[] arr = new int[3];                 // declare and init
        int[] arr2 = {1, 2, 3, 4, 5};           //unsized init
        int[] arr3 = new int[] {1, 2, 3, 4, 5}; //array initializer

        // Populate
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        // traverse
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int el : arr3) {
            System.out.println(el + " ");
        }


    }
}