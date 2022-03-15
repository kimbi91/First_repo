package hu.progmatic;

import java.util.Arrays;
import java.util.Scanner;

public class gyakorlo_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Medve Csata
/*
        int hp1 = 150, ap1 = 85;
        int hp2 = 170, ap2 = 75;

        for (int i = 0; hp1 >= 0 || hp2 >= 0; i++) {
            hp1 = hp1 - ap2;
            hp2 = hp2 - ap1;
        }

        if (hp1 > hp2 && hp1 > 0) {
            System.out.println("első medve");
        } else if (hp2 > hp1 && hp2 > 0) {
            System.out.println("második medve");
        } else {
            System.out.println("döntetlen");
        }


        // Szökőév

        System.out.println("Kérek egy évet!");
        int ev = sc.nextInt();
        sc.nextLine();

        boolean osztNegy = ev >= 1582 && ev % 4 == 0;
        boolean kerekEvek = osztNegy && ev % 100 == 0 && ev % 400 == 0;

        if (osztNegy && ev % 100 == 0) {
            System.out.println(kerekEvek?"Szökőév!":"Nem szökőév!");
        }   else if (osztNegy && kerekEvek) {
            System.out.println("Szökőév!");
        }   else if (osztNegy && !(ev % 100 == 0)) {
            System.out.println("Szökőév!");
        } else {
            System.out.println("Nem szökőév!");
        }


        System.out.println("Adj meg egy számot!");
        int number = sc.nextInt();
        sc.nextLine();


        int index = 1;
        int osztok = 0;


        for(index = 1; index <= number; index++) {
            if( number%index == 0 )
                osztok++;
        }

        System.out.println("Osztók száma: " + osztok);


        // Elem csere

        char[] chars = {'+', '-', '*', '/', '%'};

        if (chars.length > 1) {
            int last = chars.length - 1;
            char temporary = chars[0];
            chars[0] = chars[last];
            chars[last] = temporary;
        }

        System.out.println(Arrays.toString(chars));


        // Elem csere, ha...

        int[] numbers = {2, 1, -4, 3};

        if (numbers.length >= 2 && numbers[0] > numbers[1]) {
            int temporary = numbers[0];
            numbers[0] = numbers[1];
            numbers[1] = temporary;
        }

        System.out.println(Arrays.toString(numbers));


        // Tömb növelése

        int[] numbers = {-33, 66, 42, -13, 54, 89};
        int newElement = 0;

        int[] newNumbers = new int[numbers.length + 1];

        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i];
        }

        newNumbers[newNumbers.length - 1] = newElement;

        System.out.println(Arrays.toString(newNumbers));


        // Prímszám

        System.out.println("Adj meg egy számot!");
        int number = sc.nextInt();
        sc.nextLine();

        boolean nagyobbMintNulla = number > 0;
        long index = 1;
        int osztok = 0;

        for(index = 1; index <= number; index++) {
            if( number%index == 0 )
                osztok++;
        }

        System.out.println(osztok == 2 ? "Prímszám.":"Nem prímszám.");



        int a, b, i;
        int lKO = 0;

        System.out.println("Add meg az első számot!");
        a = sc.nextInt();
        System.out.println("Add meg a második számot!");
        b = sc.nextInt();

        for(i = 1; i <= a || i <= b; i++) {
            if( a%i == 0 && b%i == 0 )
                lKO = i;
        }
        System.out.println("A legnagyobb közös osztó: " + lKO);

 */
    }
}
