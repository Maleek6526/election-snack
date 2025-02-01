package myCoddingChallenges;

import java.util.Scanner;
import java.util.ArrayList;
public class HavingFunDriverClass {

    private static HavingFun newObject = new HavingFun();
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<HavingFun> database = new ArrayList<>();
    public static void main(String[] args) {
        register();
    }

    public static void register(){
        System.out.println("What is your name: ");
        String name = scanner.next();
        System.out.println("please set your password: ");
        String password = scanner.next();

        if(password.length() == 4) {

            newObject.setName(name);
            newObject.setPin(password);

            database.add(newObject);

            String display = """
                    >>>>>>>>>>>>>>>>>>>>>>>>
                    Saved successfully
                    you are now our member
                    """;

            System.out.println(display);

        }

        else{
            System.out.println("you have inputted the wrong input, please try again");
        }

    }
}
