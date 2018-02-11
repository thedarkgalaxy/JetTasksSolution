package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Zotov Mikhail on 10.02.2018.
 * Программа, возвращающая n-й по величине элемент набора чисел.
 */
public class SolutionMedium1 {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static int[] numbers;


    public static void main(String[] args) throws IOException {
        System.out.println("Введите количество чисел");
        int quantity = Integer.valueOf(reader.readLine());
        numbers = new int[quantity];
        System.out.println("Введите сами числа");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.valueOf(reader.readLine());
        }
        System.out.println("Введите номер элемента по величине");
        int rangeNumber = Integer.valueOf(reader.readLine());
        int nElement = sortAndFindNElement(numbers, rangeNumber);
        System.out.printf("%d по величине элемент: %d", rangeNumber, nElement);
    }

    public static int sortAndFindNElement(int[] numbers, int rangeNumber) {
        sort(numbers, 0, (numbers.length - 1));
        int nElement = numbers[0];
        int count = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i + 1] > numbers[i]) {
                ++count;
                if (count == rangeNumber) {
                     nElement = numbers[i+1]; break;
                }

            }
        }
        return nElement;
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
