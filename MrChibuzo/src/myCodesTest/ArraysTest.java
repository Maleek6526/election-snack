package myCodesTest;

import myCodes.Arrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysTest {
    @Test
    public void getTheDoubleArraysTest(){
        //Given
        int[] arrays = {4,5,8};
        //When
        int[] result = Arrays.getDoubleArrays(arrays);
        int[] expected = {4,5,8,8,10,16};
        //Check
        assertArrayEquals(expected, result);
    }



        @Test
        public void ArraysModernisedTest(){
            //Given
            int[] arrays = {4,5,8};
            //When
            int[] result = Arrays.getDoubleArraysModernised(arrays);
            int[] expected = {4,5,8,8,10,16};
            //Check
            assertArrayEquals(expected, result);
        }
}
