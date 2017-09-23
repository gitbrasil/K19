/**
 * Cap 02 - Cod 13 - Operadores Relacionais
 * set 22, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.k19;

public class K19_C02_C13_OperRelac {

    public static void main(String[] args) {

        int valor = 2;
        boolean t = false;
        
        System.out.println("Operadores de Relacionais\n");
        // 
        System.out.println("t = (valor == 2) \t: " + (t = ( valor == 2)));
        System.out.println("t = (valor != 2) \t: " + (t = ( valor != 2)));
        System.out.println("t = (valor < 2) \t: " + (t = ( valor < 2)));
        System.out.println("t = (valor <= 2) \t: " + (t = ( valor == 2)));
        System.out.println("t = (valor > 1) \t: " + (t = ( valor > 1)));
        System.out.println("t = (valor >= 1) \t: " + (t = ( valor >= 1)));

    }

}
