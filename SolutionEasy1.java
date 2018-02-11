package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Zotov Mikhail on 09.02.2018.
 * Программа, возвращающая 2-й по величине элемент набора чисел.
 */
public class SolutionEasy1 {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static int[] numbers;


    public static void main(String[] args) throws IOException {
      /*  System.out.println("Введите количество чисел");
        int quantity = Integer.valueOf(reader.readLine());
        numbers = new int[quantity];
        System.out.println("Введите сами числа");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.valueOf(reader.readLine());
        }*/
        int[]numbers = {1,3,3,5,5,2,7,4,9,9};
        int secondElement = sortAndFindSecondElement(numbers);
        System.out.println("Второй по величине элемент: " + secondElement);
    }

    public static int sortAndFindSecondElement(int[] numbers) {
        sort(numbers, 0, (numbers.length - 1));
        int secondElement = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i + 1] != numbers[i]) {
                secondElement = numbers[i + 1];
                break;
            }
        }
        return secondElement;
    }


    public static void sort(int[] numbers, int startIndex, int endIndex) {

        int abutmentValue = abutmentElement(numbers, startIndex, endIndex);
        int currentStartIndex = startIndex;
        int currentEndIndex = endIndex - 1;

        while (currentStartIndex < currentEndIndex) {

            while (numbers[currentStartIndex] < abutmentValue) currentStartIndex++;
            while (numbers[currentEndIndex] > abutmentValue) currentEndIndex--;

            if (currentStartIndex < currentEndIndex) {
                int buffer = numbers[currentStartIndex];
                numbers[currentStartIndex] = numbers[currentEndIndex];
                numbers[currentEndIndex] = buffer;
                currentStartIndex++;
                currentEndIndex--;
            }

            if (currentStartIndex > currentEndIndex) {break;}
        }
        if (currentStartIndex > startIndex) sort(
                numbers, startIndex, currentStartIndex);
        if (endIndex > currentStartIndex + 1) sort(
                numbers, currentStartIndex + 1, endIndex);
    }

    private static int abutmentElement(int[] array1, int startIndex, int endIndex) {
        return array1[endIndex - 1];
    }
}
