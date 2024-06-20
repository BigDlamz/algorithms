package za.co.philani.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayElementsSumTest {

    private final ArrayElementsSum calculator = new ArrayElementsSum();

    @Test
    void testAVeryBigSum() {
        List<Long> ar = Arrays.asList(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L);
        long expectedSum = 5000000015L;
        long result = calculator.aVeryBigSum(ar);
        assertEquals(expectedSum, result);
    }

    @Test
    void testAVeryBigSumEmptyList() {
        List<Long> ar = Arrays.asList();
        long expectedSum = 0L;
        long result = calculator.aVeryBigSum(ar);
        assertEquals(expectedSum, result);
    }

    @Test
    void testAVeryBigSumSingleElement() {
        List<Long> ar = Arrays.asList(1000000000L);
        long expectedSum = 1000000000L;
        long result = calculator.aVeryBigSum(ar);
        assertEquals(expectedSum, result);
    }

    @Test
    void testAVeryBigSumAllZeros() {
        List<Long> ar = Arrays.asList(0L, 0L, 0L, 0L, 0L);
        long expectedSum = 0L;
        long result = calculator.aVeryBigSum(ar);
        assertEquals(expectedSum, result);
    }

    @Test
    void testAVeryBigSumMixedValues() {
        List<Long> ar = Arrays.asList(-1000000000L, 1000000000L, -500000000L, 500000000L);
        long expectedSum = 0L;
        long result = calculator.aVeryBigSum(ar);
        assertEquals(expectedSum, result);
    }
}