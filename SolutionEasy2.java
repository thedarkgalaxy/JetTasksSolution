package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zotov Mikhail on 09.02.2018.
 * Программа, выполняющая разложение числа на набор простых множителей
 */
public class SolutionEasy2 {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static int number;
    private static int[] simpleNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};
    private static List<Integer> list = new ArrayList<>();
    private static int temp = 0;

    public static void main(String[] args) throws IOException {
        System.out.println("Введите число, которое нужно разложить на множители ...");
        number = Integer.valueOf(reader.readLine());


        while (number != 1) {
            number = computeFactor(number);
        }

        System.out.println("Простые множители в столбик: ");
        for (Integer mnog : list) {
            System.out.println(mnog);
        }
    }

    public static int computeFactor(int number) {

        for (int i = 0; i < simpleNumbers.length; i++) {
            if (number % simpleNumbers[i] == 0) {
                temp = number / simpleNumbers[i];
                list.add(simpleNumbers[i]); break;
            }
        }
        return temp;
    }
}
