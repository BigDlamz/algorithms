package za.co.philani.arrays;
import java.util.List;

public class AreaCalculator {

    /**
     *  Area = max height * width
     * @param h - list of integers representing the heights of the letters example [1,3,3,4,5,6,7,8,9,10,11,12,13,14,15,16]
     * @param word - a string
     */
    public int calculateArea(List<Integer> h, String word){

        int [] heights = h.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return word
                .chars()
                .map(c -> heights[c - 'a'])
                .max()
                .orElse(0) * word.length();

    }
}
