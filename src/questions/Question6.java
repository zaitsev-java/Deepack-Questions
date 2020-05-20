package questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question6 {

    /**
     * Question 6:
     * Create a method using Java to remove a specific value from a given int array.
     * Original array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Remove: 24
     * New Array: {32, 14, 98, 56, 148, 78}
     * <p>
     * Original array: {1, 2, 4, 3, 1, 6, 1}    Remove: 1
     * New Array: {2, 4, 3, 6}
     */

    public static void main(String[] args) {

        int[] array = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        System.out.println(removeValueFromArray(array, 24));
    }

    public static List<Integer> removeValueFromArray(int[] array, int value) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                list.remove(i);
            }
        }
        return list;
    }
}
