package com.company.solutionhard;

/**
 * Created by Zotov Mikhail on 10.02.2018.
 */
public class AkkermanFunction implements Functionable {
    public int count;

    public static void main(String[] args) {
        AkkermanFunction af = new AkkermanFunction();
        System.out.println(af.functionAk(0, 2));
    }

    @Override
    public long function(int number) {
        return 0;
    }

    public long functionAk(long n, long m) {
        inc();
        if (n == 0) return m + 1;
        else if (m == 0) return functionAk(n - 1, 1);
        else return functionAk(n - 1, functionAk(n, m - 1));
    }


    public void inc() {
        count++;
    }
}
