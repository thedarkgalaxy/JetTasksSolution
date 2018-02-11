package com.company.solutionhard;

import java.util.HashMap;

/**
 * Created by Zotov Mikhail on 10.02.2018.
 */
public class Factorial implements Functionable {
    private static HashMap<Integer, Long> factorialMap = new HashMap<>();


    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println(fact.function(12));
    }

    @Override
    public long function(int number) {
        long value = 0;
        factorialMap.put(0, 1l);

        if (factorialMap.get(number) != null) {
            value = factorialMap.get(number);

        }else {

            int startIndex = factorialMap.size();
            long result = 1;
            for (int i = startIndex; i <= number; i++) {
                result = result * i;
                factorialMap.put(i, result);
            }
            value = factorialMap.get(number);
        }
    return value;}
}
