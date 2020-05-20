package questions;

import java.util.Arrays;

public class Question4 {

    /**
     * Question 4:
     * Write a method to sort a given array (without using Arrays.sort method) and return the same.
     */

    // I will use the most base and less efficient sort method "Bubble sort"
    public static void main(String[] args) {

        int[] array = {13, 76, 39, 1, 28, 17, 3, 89, 5};

        System.out.println(Arrays.toString(sort(array)));
    }

    private static int[] sort(int[] array) {
        for (int element : array) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
}
