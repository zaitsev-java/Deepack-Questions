package questions;

import java.util.*;

public class Question1 {

    /**
     * Question 1:
     * Write a method to return the common elements between two arrays (string values)
     * Note: Length of input arrays can be different also.
     * Example:
     * Input arrays
     * array1 -> {“ab”, “abcd”, “abc”, “abcde”, “c”, "koli”}
     * array2 -> {“abcde”, “jhuy”, “plot”, “koli”}
     * Method should return -> [“abcde” , “koli”]
     */
    public static void main(String[] args) {

        String[] array1 = {"ab", "abcd", "abc", "abcde", "abcde", "c", "koli"};
        String[] array2 = {"abcde", "jhuy", "plot", "koli"};

        String[] result = findCommonElements(array1, array2);
        System.out.println(Arrays.toString(result));
    }

    public static String[] findCommonElements(String[] array1, String[] array2) {
        Set<String> set1 = new TreeSet<>(Arrays.asList(array1));
        Set<String> set2 = new TreeSet<>(Arrays.asList(array2));
        Set<String> common = new TreeSet<>(set1);
        common.retainAll(set2);
        String[] result = new String[common.size()];
        common.toArray(result);
        return result;
    }
}

