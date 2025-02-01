package myCoddingChallenges;

import java.util.Arrays;

public class CodeWar {
    public static void main(String[] args) {

        int[] arrayOne = {1,2,3,7,9,11};
        int[] arrayTwo = {2,4,6,8,10,12};

        int[] arr = {1,2,3,4,5};
        int[] arr2 = {3,5,1,2,4};

        System.out.println(Arrays.toString(getAlternateElement(arrayOne, arrayTwo)));
        getTranspose();
        System.out.println(Arrays.toString(sampleInput(arr, arr2)));


    }

    public static int[] getAlternateElement(int[] array, int[] array2){
        int[] newArray = new int[array.length + array2.length];
        int counter = 1;

        for (int index = 0; index < array.length; index++) {
            newArray[counter-1] = array[index];
            newArray[counter] = array2[index];
            counter+=2;
        }
        return newArray;


    }

    public static void getTranspose(){
        int num = 1;
        int [][] a = new int[3][3];
        int [][] b = new int [3][3];
        for (int count =0;count<3;count++){
            for (int i = 0; i < 3; i++) {
                a[count][i] = num;
                num++;

            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[j][i]);

            }

            System.out.println();
        }
    }




    public static int[] sampleInput(int[] arrayOne, int[] arrayTwo){
        int[] newArray = new int[arrayOne.length];

        for (int index = 0; index < arrayOne.length; index++) {
            for (int counter = 0; counter < arrayTwo.length; counter++) {
                if(arrayOne[index] == arrayTwo[counter]){
                    newArray[index] = counter;
                }

            }
        }

        return newArray;
    }
}
