package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Zotov Mikhail on 09.02.2018.
 * Программа, выполняющая поиск подстроки в строке.
 */
public class SolutionEasy5 {
    static private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private static String string;
    private static String substring;

    public static void main(String[] args) {
        System.out.println(isSubstringDetected("мама мыла раму мылом", "лом"));
    }

    public static boolean isSubstringDetected(String string, String substring) {
        if (string.length() < substring.length()) return false;
        char[] stringArray = string.toCharArray();
        char[] substringArray = substring.toCharArray();
        int length = substring.length();
        int lastIndex = length - 1;
        int subCount = lastIndex;
        boolean flag = false;
        for (int i = 0; i < stringArray.length; i++) {
            if ((stringArray[i] == substringArray[0]) && (stringArray[i + lastIndex] == substringArray[lastIndex])) {
                flag = true;
               for(int count = i + lastIndex; count > i; count--) {
                   if (!(stringArray[count] == substringArray[lastIndex--])) {flag = false; break;}
               }
               break;
            }


        }
        return flag;}
}
