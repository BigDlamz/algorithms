package za.co.philani.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AreaCalculatorTest {

    private AreaCalculator calculateArea;

    @BeforeEach
    void setUp() {
        calculateArea = new AreaCalculator();
    }

    @Test
    void testCalculateArea() {
        List<Integer> heights = Arrays.asList(1, 3, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26);
        String word = "abc";
        int expectedArea = 3 * 3; // max height is 3, length is 3
        int result = calculateArea.calculateArea(heights, word);
        assertEquals(expectedArea, result);
    }

    @Test
    void testCalculateAreaWithEmptyString() {
        List<Integer> heights = Arrays.asList(1, 3, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26);
        String word = "";
        int expectedArea = 0; // empty string should result in area 0
        int result = calculateArea.calculateArea(heights, word);
        assertEquals(expectedArea, result);
    }

    @Test
    void testCalculateAreaWithSingleCharacter() {
        List<Integer> heights = Arrays.asList(1, 3, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26);
        String word = "z";
        int expectedArea = 26 * 1; // height of 'z' is 26, length is 1
        int result = calculateArea.calculateArea(heights, word);
        assertEquals(expectedArea, result);
    }

    @Test
    void testCalculateAreaWithSameCharacters() {
        List<Integer> heights = Arrays.asList(1, 3, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26);
        String word = "aaa";
        int expectedArea = 1 * 3; // height of 'a' is 1, length is 3
        int result = calculateArea.calculateArea(heights, word);
        assertEquals(expectedArea, result);
    }

    @Test
    void testCalculateAreaWithDifferentCharacters() {
        List<Integer> heights = Arrays.asList(1, 3, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26);
        String word = "xyz";
        int expectedArea = 26 * 3; // max height is 26, length is 3
        int result = calculateArea.calculateArea(heights, word);
        assertEquals(expectedArea, result);
    }
}