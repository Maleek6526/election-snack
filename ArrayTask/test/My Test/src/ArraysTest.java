package My Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysTest {
    @Test
    public void getDoubleElementsTest(){
        //Given
        int[] myArrays = {4,5,8};
        //When
        int[] result = Arrays.getDoubleElements(myArrays);
        //Check
        int[] expected = {4,5,8};
        assertArrayEquals(expected, result);
    }
}
