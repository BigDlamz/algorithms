package za.co.philani.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayRotation {

    /**
     * Rotate the array to the left by d positions
     * @param a - list of integers
     * @param d - number of positions to rotate the array
     * @return - the rotated array
     */

    public List<Integer> rotateLeft(List<Integer> a, int d) {

        if (a.isEmpty()) {
            return a;
        }

        int rotation = d % a.size();

        if (rotation == 0) {
            return a;
        }

        int[] array = a.stream().mapToInt(Integer::intValue).toArray();
        int[] rotated = new int[array.length];

        System.arraycopy(array, rotation, rotated, 0, array.length - rotation);
        System.arraycopy(array, 0, rotated, array.length - rotation, rotation);

        return Arrays.stream(rotated)
                     .boxed()
                     .collect(Collectors.toList());

    }
}
