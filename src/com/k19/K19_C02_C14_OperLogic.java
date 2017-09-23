/**
 * Cap 02 - Cod 14 - Operadores Lógicos
 * set 22, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.k19;

public class K19_C02_C14_OperLogic {

    public static void main(String[] args) {

        int valor = 30;
        boolean teste = false;
        
        System.out.println("Operadores de Relacionais\n");
        // 
        System.out.println("teste = valor < 40 && valor > 20 \t: " + (teste = valor < 40 && valor > 20));
        System.out.println("teste = valor < 40 && valor > 30 \t: " + (teste = valor < 40 && valor > 30));
        System.out.println("teste = valor > 30 || valor > 20 \t: " + (teste = valor > 30 || valor > 20));
        System.out.println("teste = valor > 30 || valor < 20 \t: " + (teste = valor > 30 || valor < 20));
        System.out.println("teste = valor < 50 && valor == 30 \t: " + (teste = valor < 50 && valor == 30));


    }

}
