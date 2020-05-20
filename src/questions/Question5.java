package questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Question5 {

    /**
     * Question 5:
     * Create a method to return missing smallest positive integer (greater than 0) from given array.
     * Example:
     * For array : [1,3,5,4,2,7]
     * Method should return : 6
     * For array : [-1, -3, 4, 2]
     * Method should return : 1
     * For array : [0, 5, -1, 1, 2, 4, 5, 3, 7, 1, 2]
     * Method should return : 6
     */

    public static void main(String[] args) {

        int[] array = {0, 5, -1, 1, 2, 4, 5, 3, 7, 1, 2};

        System.out.println(missSmallPosInt(array));
    }

    public static Set<Integer> missSmallPosInt(int[] array) {
        Arrays.sort(array);
        // using Stream to remove zero and negative values
        array = Arrays.stream(array).filter(s -> s > 0).toArray();
        // conversion Array to Set
        Set<Integer> set1 = Arrays.stream(array).boxed().collect(Collectors.toSet());
        // Min and Max I will need to create my set "mask"
        int minValue = Collections.min(set1);
        int maxValue = Collections.max(set1);
        // Creating set "mask"
        Set<Integer> set2 = new HashSet<>();
        for (int i = minValue; i <= maxValue; i++) {
            set2.add(i);
        }
        // Removing my Set from Set "mask" to get missing values
        set2.removeAll(set1);
        return set2;
    }
}
