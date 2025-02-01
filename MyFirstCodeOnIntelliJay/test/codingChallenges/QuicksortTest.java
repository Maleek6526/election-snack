package codingChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuicksortTest {

    @Test
    public void quicksortTest(){
        //Given
        int[] numbers = {9, 2, 1, 7, 4};
        int start = 0;
        int end = numbers.length-1;

        //When
        numbers = Quicksort.quicksort(numbers, start, end);

        //Check
        int[] expected = {1,2,4,7,9};
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void findMaximumProductTest(){
        //Given
        int[] numbers = {9, 2, 1, 7, 4, -9, -8};

        //When
        numbers = Quicksort.findMaximumProduct(numbers);

        //Check
        int[] expected = {-9, -8};
        assertArrayEquals(expected, numbers);
    }

}
