package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zotov Mikhail on 10.02.2018.
 * Программа выполняющая Run-length encoding кодирование строки (aaabccdd -> 3a1b2c2d)
 */
public class SolutionMedium2 {
    static Map<Character, Integer> forCode = new HashMap<>();
    StringBuffer stBuffer = new StringBuffer();

    public static void main(String[] args) {
        SolutionMedium2 sm2 = new SolutionMedium2();
        System.out.println(sm2.coding("aaabccdd"));
    }


    public String coding(String string) {
        char[] arrayForCode = string.toCharArray();
        int tempValue;
        int counter = 1;
        boolean flag = false;
        for (int i = 0; i < arrayForCode.length - 1; i++) {
            //boolean flag = false;
            if (arrayForCode[i + 1] == arrayForCode[i]) {
                flag = true;
                counter++;
                if(i == (arrayForCode.length - 2)){
                    stBuffer.append(counter);
                    stBuffer.append(arrayForCode[i]);}
            }
            //else {
            if ((arrayForCode[i + 1] != arrayForCode[i])) {
                stBuffer.append(counter);
                stBuffer.append(arrayForCode[i]);
                flag = false;
                counter = 1;
            }

        }

        if(arrayForCode[arrayForCode.length-1] != arrayForCode[arrayForCode.length-2]){
            stBuffer.append("1");
            stBuffer.append(arrayForCode[arrayForCode.length-1]);}
        return stBuffer.toString();
        }

}


