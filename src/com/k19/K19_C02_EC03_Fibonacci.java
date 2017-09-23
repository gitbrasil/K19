/**
 * Cap 02 - Exe Compl 02 - Fibonacci
 * set 23, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.k19;

public class K19_C02_EC03_Fibonacci {

    public static void main(String[] args) {

        int cont = 1;
        int num1 = 1;
        int num2 = 0;

        System.out.println("Sequencia Fibonacci (com while)");

        while (cont <= 10) {
            if (cont == 1) {
                System.out.println(cont + "o num.: " + num1);
            } else {
                num1 = num1 + num2;
                num2 = num1 - num2;
                System.out.println(cont + "o num.: " + num1);
            }
            cont++;
        }

        System.out.println("\nSequencia Fibonacci (com for)");
        num1 = 1;
        num2 = 0;
        for (int i = 1; i <= 10; i++) {
            if (i == 1) {
                System.out.println(i + "o num.: " + num1);
            } else {
                num1 += num2;
                num2 = num1 - num2;
                System.out.println(i + "o num.: " + num1);
            }
        }

    }

}
