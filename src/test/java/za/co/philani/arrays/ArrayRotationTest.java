package za.co.philani.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayRotationTest {

    private ArrayRotation rotation;

    @BeforeEach
    void setUp() {
        rotation = new ArrayRotation();
    }

    @Test
    void testRotateLeft() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(3, 4, 5, 1, 2);
        List<Integer> result = rotation.rotateLeft(input, 2);
        assertEquals(expected, result);
    }

    @Test
    void testRotateLeftByZero() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = rotation.rotateLeft(input, 0);
        assertEquals(expected, result);
    }

    @Test
    void testRotateLeftBySize() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = rotation.rotateLeft(input, 5);
        assertEquals(expected, result);
    }

    @Test
    void testRotateLeftMoreThanSize() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(2, 3, 4, 5, 1);
        List<Integer> result = rotation.rotateLeft(input, 6); // same as rotating by 1
        assertEquals(expected, result);
    }

    @Test
    void testRotateLeftEmptyList() {
        List<Integer> input = Collections.emptyList();
        List<Integer> expected = Collections.emptyList();
        List<Integer> result = rotation.rotateLeft(input, 2);
        assertEquals(expected, result);
    }

    @Test
    void testRotateLeftSingleElement() {
        List<Integer> input = Collections.singletonList(1);
        List<Integer> expected = Collections.singletonList(1);
        List<Integer> result = rotation.rotateLeft(input, 1);
        assertEquals(expected, result);
    }
}
