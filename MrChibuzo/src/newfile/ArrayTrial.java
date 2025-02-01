package newfile;

import java.util.ArrayList;

public class ArrayTrial {

    public static void main(String[] args) {
        int[] element = {1,4,2,3,2,2,4,0,2,4,6,7,3,1,3,3};
        int pivot = 4;
        ArrayList<Integer> datas = getTheNumberThatGivesFour(element,pivot);
        System.out.println(datas);

    }


    public static ArrayList<Integer> getTheNumberThatGivesFour(int[] element, int pivot){
        ArrayList<Integer> data = new ArrayList<>();
        for (int index = 1; index < element.length; index++) {
            if((element[index - 1] + element[index] == pivot) || (element[index-1] - element[index] == pivot) || (element[index] - element[index - 1]) == pivot){
                data.add(element[index - 1]);
                data.add(element[index]);
            }
        }
        return data;
    }
}
