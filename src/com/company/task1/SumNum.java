package com.company.task1;

import java.util.Scanner;

public class SumNum {
    public int calc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter smth");
        
        String inputString = scanner.nextLine();
        int summa = 0;
        
        char[] charStr = inputString.toCharArray();

        for (char symb: charStr) {
            if (symb >='0' && symb<='9'){
                 summa+=Integer.parseInt(String.valueOf(symb));
            }
        }
        return summa;
    }

    public SumNum() {

    }
}
