/*
Kurt Kaiser
CTIM 168

7.31.2018
C11PP3
 */

import java.util.Scanner;

public class Fibonacci {
    static int getFibNum(int num)
    {
        if (num <= 1)
            return num;
        return getFibNum(num-1) + getFibNum(num-2);
    }

    public static void main (String args[])
    {
        System.out.print("Specify how many Fibonacci numbers to calculate: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for (int i = 0; i < 2; i++) {
            System.out.println("Fibonacci #" + (i + 1) + " = " + getFibNum(i));
        }
        if (input >=3) {
            int fibNum;
            double doubleFibNum;
            int lastFibNum = getFibNum(1);
            double ratio;
            for (int i = 2; i < input; i++) {
                fibNum = getFibNum(i);
                doubleFibNum = fibNum;
                ratio = (doubleFibNum/ lastFibNum);
                System.out.println("Fibonacci #" + (i + 1) + " = " + fibNum +
                        "; " + fibNum + "/" + lastFibNum + " = " +
                        Math.round(ratio * 100000.0) / 100000.0);
                lastFibNum = getFibNum(i);
            }
        }
    }
}
