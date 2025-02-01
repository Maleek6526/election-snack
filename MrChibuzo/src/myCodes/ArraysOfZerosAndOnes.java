package myCodes;

public class ArraysOfZerosAndOnes {
    public static int[] getZerosAndOnes(int[] arrays) {

        int[] newArray = new int[arrays.length];

        for (int index = 0; index < arrays.length; index++) {
            if(arrays[index] < 0) {
                return null;
            }
            else if (arrays[index] % 2 == 0) {
                newArray[index] = 0;
            }
            else newArray[index] = 1;

        }

        return newArray;
    }

}
