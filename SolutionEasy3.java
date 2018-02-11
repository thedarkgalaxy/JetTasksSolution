package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Zotov Mikhail on 09.02.2018.
 * Программа, выполняющая проверку строки на то, что она является палиндромом
 * (допущения : 1. Строка без знаков препинания, только пробелы 2. Символы е и ё, и й разные 3. Не учитывает регистр)
 */
public class SolutionEasy3 {
    static private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private static String string;

    public static void main(String[] args) throws IOException {
        string = reader.readLine();
        if (isPalindromString(string)){
            System.out.println("Что то похожее на палиндром");
        }else {
            System.out.println("Шляпа какая то");
        }

    }

    public static boolean isPalindromString(String checkedString){
        char[] array;
        boolean flag = true;

        String resultForCheck = checkedString.replaceAll("[ ]*", "").toLowerCase();
        if (resultForCheck.length()%2 == 0) {return false;}

        array = resultForCheck.toCharArray();

        for (int i = 0; i<array.length/2; i++) {
           if (array[i] != array[array.length-1-i]){return false;}

        }
    return true;
    }
}
