package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Zotov Mikhail on 10.02.2018.
 * Количество разменов на n1..nk копеек
 * Число способов разменять сумму a с помощью n типов монет равняется
 числу способов разменять сумму a с помощью всех типов монет, кроме последнего,плюс
 число способов разменять сумму a − d с использованием всех n типов монет, где d — достоинство монет последнего типа.
 */
public class SolutionMedium4 {
    static private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> changeList = new ArrayList<>();
    private static String string;
    static int number;

    public static void main(String[] args) throws IOException {
        System.out.println("Введите число для размена");
        number = Integer.valueOf(reader.readLine());
        System.out.println("Введите монеты для размена, по окончании ввода введите ok");
        ArrayList<Integer> changeList = new ArrayList<>();
        String value;
        while (!(value = reader.readLine()).equals("ok")) {
            changeList.add(Integer.valueOf(value));

        }

        int result = exchange(changeList,number);
        System.out.println(result);
    }

    public static int exchange(ArrayList changeList, int number) {
        if ((changeList.size() == 0) || number < 0){
            return 0;}

        if ((changeList.size() == 1) && ((int)changeList.get(0) == 1) && (number > 1)){
            return 1;}

        if (number == 0){return 1;}


        int lastIndex = changeList.size() - 1;
        int maxElement = (int)changeList.get(lastIndex);

        ArrayList<Integer> newChangeList = new ArrayList<>();

        for (Object value: changeList)
              {
                  newChangeList.add((int) value);
        }

        newChangeList.remove(lastIndex);

        return exchange(changeList, number - maxElement) + exchange(newChangeList, number);


    }

}
