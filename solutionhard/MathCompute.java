package com.company.solutionhard;

import java.io.*;

/**
 * Created by Zotov Mikhail on 11.02.2018.
 */
public class MathCompute extends Thread {
    String fileName;

    public static void main(String[] args) throws IOException {


        BufferedReader fileReader = null;
        try{
        fileReader = new BufferedReader(new FileReader(args[0]));
        }catch(FileNotFoundException e) {System.out.println("Файл не найден");}
        if (fileReader !=null) {
            while (fileReader.ready()){
            fileReader.readLine().split(" ");
            }
        }
    }

    @Override
    public void run() {

    }
}
