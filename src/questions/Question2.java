package questions;

import java.util.HashSet;
import java.util.Set;

public class Question2 {

    /**
     * Question 2:
     * Write a method to return the duplicate values of an array of string values.
     * Example:
     * Input String array -> {“hello”, “peace”, “hello” , “happy”, “happy”, “grow” , “happy”}
     * Method should return -> [“hello”, “happy”]
     */

    public static void main(String[] args) {
        String[] array = {"hello", "peace", "hello", "happy", "happy", "grow", "happy"};

        System.out.println(findDuplicates(array));
    }

    public static Set<String> findDuplicates(String[] array) {
        Set<String> result = new HashSet<>();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i].equals(array[j])) && (i != j)) {
                    result.add(array[j]);
                }
            }
        }
        return result;
    }
}