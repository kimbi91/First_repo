package hu.progmatic;

import java.util.Arrays;

public class gyakorlo_3 {

    public static void main(String[] args) {

        // Számjegyösszegző

        /*int number = -5483229;
        int result = 0;

        if (number < 0) {
            number = number * -1;
        }

        while (number > 0) {
            int digit = number % 10;
            result += digit;
            number /= 10;
        }

        System.out.println(result);*/

        // Hatványozás
        /*int base = 7, exponent = 5, result = 1;

        for (int i = exponent; i > 0; i--) {
            result *= base;
        }

        if (base == exponent) {
            System.out.println("Az eredmény: 1");
        } else {
            System.out.println("Az eredmény: " + result);
        }*/

        // Minimumkeresés
        /*int[] numbers = {-104, -442, -422, -66, -333, -103, -89, -66, -501, -316, -114};
        int minValue = Integer.MAX_VALUE, temp = 0;

        for (int i = 0; i < numbers.length; i++) {
            temp = numbers[i];
            if (temp < minValue) {
                minValue = temp;
            }
        }

        System.out.println(minValue);*/

        // Maximumkeresés

        /*int[] numbers = {-104, -442, -422, -66, -333, -103, -89, -66, -501, -316, -114};
        int maxValue = Integer.MIN_VALUE, temp = 0;

        for (int i = 0; i < numbers.length; i++) {
            temp = numbers[i];
            if (temp > maxValue) {
                maxValue = temp;
            }
        }

        System.out.println(maxValue);*/

        //Konvertálás

        /*int[] numbers = {-2, 1, -6, 10};
        String[] numbersString = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numbersString[i] = String.valueOf(numbers[i]);
        }

        System.out.println(Arrays.toString(numbersString));*/

        // Tükörtömb

        /*int[] numbers = {1, 2, 2, 3, 4, 5, 5, 4, 3, 2, 2, 1};
        int temp = 0, tempIndex = numbers.length - 1;
        boolean mirrorArray = false;

        if (numbers.length == 1) {
            System.out.println("Tükörtömb");
        }

        for (int i = 0; i < numbers.length; i++) {
            temp = numbers[tempIndex];
            mirrorArray = numbers[i] == temp? true : false;
            tempIndex--;
            if (!mirrorArray) {
                break;
            }
        }


        System.out.println("Is it a mirror array: " + mirrorArray);*/

    }
}
