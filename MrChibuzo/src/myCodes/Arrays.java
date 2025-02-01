package myCodes;

public class Arrays {
    public static int[] getDoubleArrays(int[] arrays) {
        int[] newArray = new int[arrays.length * 2];

        for (int index = 0; index < arrays.length; index++) {
            newArray[index] = arrays[index];
        }
        int counter = 0;
        for (int count = arrays.length; count < newArray.length; count++) {
            newArray[count] = arrays[counter] + arrays[counter];
            counter++;
        }
        return newArray;
    }

    public static int[] getDoubleArraysModernised(int[] arrays) {
        int[] newArray = new int[arrays.length * 2];

        for (int index = 0; index < arrays.length; index++) {
            newArray[index] = arrays[index];
            newArray[index + arrays.length] = arrays[index] * 2;
        }
        return newArray;
    }
}
