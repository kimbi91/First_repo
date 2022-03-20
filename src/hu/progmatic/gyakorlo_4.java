package hu.progmatic;

import java.util.Arrays;

public class gyakorlo_4 {

    public static void main(String[] args) {

        // Random tömb

        /*int[] numbers = new int[10];
        int temp = 0, temp2 = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        for (int i = 0; i < numbers.length; i++) {
            temp = (int) (Math.random() * 9 + 1);
            temp2 = numbers[i];
            numbers[i] = numbers[temp];
            numbers[temp] = temp2;
        }

        System.out.println(Arrays.toString(numbers));*/

        // Szám osztói

        /*int number = 2147483647, index = 0;

        for (long i = 1; i <= number; i++) {
            if (number % i == 0) {
                index++;
            }
        }

        int[] divs = new int[index];
        index = 0;

        for (long i = 1; i <= number; i++) {
            if (number % i == 0) {
                divs[index] = (int) i;
                index++;
            }
        }

        System.out.println(Arrays.toString(divs));*/

        // Tömb számjegyei

        /*long temp = 0, digit = 0;
        String result1 = "egyszer sem szerepelnek: ", result2 = " alkalommal szerepel a: ";
        long[] numbers = {-1526446364, 1874047238, 1064541050, -815818089, 467498070, -1427103238, 1267273266, -1248819505, 839131004, -1313719080, 1545523494};
        int[] digitCounter = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] repetition = new int[50];

        for (int i = 0; i < repetition.length; i++) {
            repetition[i] = i + 1;
        }


        for (int i = 0; i < numbers.length; i++) {
            temp = numbers[i];

            if (temp < 0) {
                temp = temp * -1;
            }

            while (temp > 0) {
                digit = temp % 10;
                digitCounter[(int) digit] += 1;
                temp = temp / 10;
            }
        }

        for (int i = 0; i < digitCounter.length; i++) {

            if (digitCounter[i] == 0) {
                result1 += i + ", ";
            } else {
                System.out.println(digitCounter[i] + result2 + i);
            }
        }

        System.out.println(result1);*/




    }
}
