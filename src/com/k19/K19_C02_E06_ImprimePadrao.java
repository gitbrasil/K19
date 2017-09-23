/**
 * Cap 02 - Exe 06 - Imprimir até 100 - For
 * set 23, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.k19;

public class K19_C02_E06_ImprimePadrao {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("*");
            } else {
                System.out.println("**");
            }
        }
    }

}
