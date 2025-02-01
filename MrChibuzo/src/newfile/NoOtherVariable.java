package newfile;

public class NoOtherVariable {
    public static void main(String[] args) {
        int num1 = 123;
        int num2 = 163;
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1);
        System.out.println(num2);
    }
}
