/**
 * Cap 02 - Exe Compl 01 - Triangulo
 * set 23, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.k19;

public class K19_C02_EC01_Triangulo {

    public static void main(String[] args) {

        String caracter = "*";
        byte cont = 0;

        while (cont < 5) {
            System.out.println(caracter);
            cont++;
            caracter += "*";
        }
    }

}
