package com.company;

import java.io.BufferedReader;

/**
 * Created by Zotov Mikhail on 10.02.2018.
 * Программа выполняющая Run-length encoding декодирование строки (3a1b2c2d->aaabccdd)
 */
public class SolutionMedium3 {


    public static void main(String[] args) {
        String magic;
        magic = encoding("3a1b2c2d");
        System.out.println(magic);
    }

    public static String encoding(String string){
        String [] arrayNumbers;
        String [] arraySymbols;
        StringBuffer sb = new StringBuffer();
        arrayNumbers = string.split("[A-Za-z]"); // искомые значения начинаются с нуля
        arraySymbols = string.split("[1-9]+"); // искомые значения начинаются с единицы( массив больше на единицу, 0 элемент пустой в связи с регэксом)

        for (int i = 1; i < arraySymbols.length; i ++){
            int counter = Integer.valueOf(arrayNumbers[i-1]);
            while (counter-- > 0){
                sb.append(arraySymbols[i]);
            }
        }

        return sb.toString();
    }
}
