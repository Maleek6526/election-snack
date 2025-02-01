package codingChallenges;

public class Quicksort {
    public static int[] quicksort(int[] numbers, int start, int end) {
        if(start < end) {
            int indexOfPartition = partition(numbers, start, end);
            quicksort(numbers, start, indexOfPartition - 1);
            quicksort(numbers, indexOfPartition + 1, end);
        }
        return numbers;
    }

    private static int partition(int[] numbers, int start, int end) {
        int pivot = numbers[end];
        int currentIndex = start;

        for (int index = start; index < end; index++) {
            if(numbers[index] < pivot) {
                swap(numbers, currentIndex, index);
                currentIndex++;
            }
        }
        swap(numbers, currentIndex, end);
        return currentIndex;
    }

    private static void swap(int[] numbers, int currentIndex, int index) {
        int temp = numbers[currentIndex];
        numbers[currentIndex] = numbers[index];
        numbers[index] = temp;
    }

    public static int[] findMaximumProduct(int[] numbers){
        quicksort(numbers, 0, numbers.length-1);
        int firstElement = numbers[0];
        int secondElement = numbers[1];
        int secondToTheLastElement = numbers[numbers.length-2];
        int lastElement = numbers[numbers.length-1];
        if((secondElement * firstElement) > (lastElement * secondToTheLastElement)){
            return new int[] {firstElement, secondElement};
        }
        return new int[] {secondToTheLastElement, lastElement};
    }
}
