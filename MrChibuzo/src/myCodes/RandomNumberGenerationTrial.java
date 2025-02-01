package myCodes;

import java.util.Random;
public class RandomNumberGenerationTrial {
    private static Random random = new Random();
    public static void main(String[] args) {
        System.out.println(getRandomStringNumber());

    }

    public static String getRandomStringNumber(){

        int[] generated = checkValidity();

        String number = "";

        for (int index = 0; index < generated.length; index++) {
            number = String.valueOf(generated[index]);
        }


        String addition = "BB";

        String finalConversion = addition + number;

        return finalConversion;
    }

    public static long generateRandomNumber(){

        long numberGenerator = random.nextLong(10000000000l);

        return numberGenerator;

    }

    public static int[] getOddAndEvenIndexes(){

        long otherFunction = generateRandomNumber();

        String conversion = String.valueOf(otherFunction);

        int[] data = new int[conversion.length()];

        for (int index = 0; index < conversion.length(); index++) {
            data[index] = Integer.parseInt(String.valueOf(conversion.charAt(index)));

        }

        int[] arrayDoubleConvertedIntCreditCard = new int[data.length];

        int doubleConvertedIntCreditCard = 0;

        for(int count = 0; count < data.length; count++){

            if(data.length % 2 == 0){

                if(count % 2 == 0){

                    doubleConvertedIntCreditCard = data[count] * 2;

                    if(doubleConvertedIntCreditCard > 9){

                        doubleConvertedIntCreditCard -= 9;

                    }

                    else{

                        doubleConvertedIntCreditCard = data[count] * 2;

                    }

                    arrayDoubleConvertedIntCreditCard[count] = doubleConvertedIntCreditCard;

                }

                else{

                    arrayDoubleConvertedIntCreditCard[count] = data[count];

                }
            }


            else if (data.length % 2 == 1){

                if(count % 2 != 0){

                    doubleConvertedIntCreditCard = data[count] * 2;

                    if(doubleConvertedIntCreditCard > 9){

                        doubleConvertedIntCreditCard -= 9;

                    }

                    else{

                        doubleConvertedIntCreditCard = data[count] * 2;

                    }

                    arrayDoubleConvertedIntCreditCard[count] = doubleConvertedIntCreditCard;
                }
            }

            else{

                arrayDoubleConvertedIntCreditCard[count] = data[count];
            }

        }


        return arrayDoubleConvertedIntCreditCard;

    }


    public static int[] checkValidity(){

        int[] checkValidity = getOddAndEvenIndexes();

        int totalArraySum = 0;

        int[] result = {};


        for(int count = 0; count < checkValidity.length; count++){

            totalArraySum += checkValidity[count];

        }

        if(totalArraySum % 10 == 0){

            result = checkValidity;

        }

        return result;
    }
}
