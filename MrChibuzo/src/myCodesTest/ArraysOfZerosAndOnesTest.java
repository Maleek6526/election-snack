package myCodesTest;

import myCodes.ArraysOfZerosAndOnes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysOfZerosAndOnesTest {
    @Test
    public void getTheZerosAndOnes(){
        //Given
        int[] arrays = {4,5,8,8,8,2,9};
        //When
        int[] result = ArraysOfZerosAndOnes.getZerosAndOnes(arrays);
        //Check
        int[] expected = {0,1,0,0,0,0,1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void checkForANegativeNumber(){
        //Given
        int[] arrays = {-4,-5,-8,-8,-8,-2,-9};
        //When
        int[] result = ArraysOfZerosAndOnes.getZerosAndOnes(arrays);
        //Check
        int[] expected = null;
        assertArrayEquals(expected, result);
    }
}
