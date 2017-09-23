/**
 * Cap 02 - Cod 04 - Imprimindo os parametros da "linha de comando"
 * set 22, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.k19;

public class K19_C02_C04_Args {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
