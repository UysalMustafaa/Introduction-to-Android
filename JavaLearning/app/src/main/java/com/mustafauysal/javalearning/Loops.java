package com.mustafauysal.javalearning;

import java.sql.SQLOutput;

public class Loops {

    public static void main(String[] args) {

        //For Loop

        int[] myNumbers = {12, 15, 18, 21, 24};

        int x = myNumbers[0] / 3 * 5;
        System.out.println(x);

        for (int i = 0; i < myNumbers.length; i++) {
            int y = myNumbers[i] / 3 * 5;
            System.out.println(y);
        }

        for (int number : myNumbers){
            int z = number / 3 * 5;
            System.out.println(z);
        }

        for (int a = 0; a < 10; a++) {
            int b = a * 10;
            System.out.println(b);
        }

        int j = 0;

        while (j < 10) {
            int m =  j * 10;
            System.out.println(m);
            j++;
        }
    }
}
