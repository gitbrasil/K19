/**
 * Cap 02 - Exe 07 - Escrever 'pi' a cada multiplo de 4
 * set 23, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.k19;

public class K19_C02_E07_ImprimePadrao {

    public static void main(String[] args) {

        System.out.println("Brincadeira do 'pii' de 0 a 40.\n");
        for (int i = 1; i <= 40; i++) {     // iniciar contador em 1
            if (i % 4 == 0) {
                System.out.println("pii \n");
            } else {
                System.out.println(i);
            }
        }
    }

}
