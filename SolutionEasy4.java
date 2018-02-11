package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Zotov Mikhail on 09.02.2018.
 *  Программа, возвращающая список разменов на 3,5 копеек и 3, 5, 7 копеек.
 *  (
 На 3 делятся все натуральные числа, сумма цифр которых кратна 3.
 На 5 делятся все натуральные числа, оканчивающиеся на 5 или 0.
 На 7 деляться числа кратные семи.)
 */
public class SolutionEasy4 {
    static private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private static String string;
    static String number;

    public static void main(String[] args) throws IOException {
        System.out.println("Введите число для размена");
        number = reader.readLine();
        exchange357(number);
        exchangeListfor3and5(Integer.valueOf(number));
        exchangeListfor3and5and7(Integer.valueOf(number));
    }

    public static void exchange357(String number) {
        char[] arrayOfNumber = number.toCharArray();
        int sum3 = 0;

        for (int i = 0; i < arrayOfNumber.length; i++) {
            sum3 += arrayOfNumber[i];
        }

        if (sum3 % 3 == 0) {
            System.out.println("Число можно полностью разменять по три копейки");
        }

        if ((arrayOfNumber[arrayOfNumber.length - 1] == '0') || (arrayOfNumber[arrayOfNumber.length - 1] == '5')) {
            System.out.println("Число можно полностью разменять по пять копеек");
        }

        if (Integer.valueOf(number)%7 == 0) {
            System.out.println("Число можно полностью разменять по семь копеек");
        }
    }

    public static void exchangeListfor3and5(int number) {
        int x = 0;
        int y = 0;
        int ostatok = 0;

        for (x = 1; x < number/3; x++) {
            for (y = 1; y < number/5; y++) {
                if (3 * x + 5 * y == number) {
                    System.out.printf("%s по три и %s по пять", x, y);
                    System.out.println();
                }

            }


        }
    }

    public static void exchangeListfor3and5and7(int number) {
        int x = 0;
        int y = 0;
        int z = 0;
        int ostatok = 0;

        for (z = 1; z < number/7; z++) {
            for (y = 1; y < number/5; y++) {
                for (x = 1; x < number/3; x++) {
                    if (3 * x + 5 * y + 7 * z == number) {
                        System.out.printf("%s по три и %s по пять и %s по семь", x, y, z);
                        System.out.println();
                    }

                }


            }
        }
    }
}
