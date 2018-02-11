package com.company.solutionhard;


/**
 * Created by Zotov Mikhail on 10.02.2018.
 *
 */
public class FibonacciFunction implements Functionable {

    public static void main(String[] args) {
        FibonacciFunction ff = new FibonacciFunction();

        int number = 15; // номер в последовательности
        System.out.println(ff.function(number));

    }

    @Override
    public long function(int number) {
        if (number <= 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else if (number == 2) {
            return 1;
        } else {
            return function(number - 1) + function(number - 2);
        }
    }
}

