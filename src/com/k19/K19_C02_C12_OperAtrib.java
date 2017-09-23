/**
 * Cap 02 - Cod 12 - Variaveis - Operadores Atribuicao
 * set 22, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.k19;

public class K19_C02_C12_OperAtrib {

    public static void main(String[] args) {

        int valor = 1;
        
        System.out.println("Operadores de Atribuicao\n");
        // 
        System.out.println("• Todas Simples ");
        System.out.println("int valor = 1 \t\t: " + valor);
        System.out.println("valor = valor + 2 \t: " + (valor = valor + 2));
        System.out.println("valor = valor - 1 \t: " + (valor = valor - 1));
        System.out.println("valor = valor * 6 \t: " + (valor = valor * 6));
        System.out.println("valor = valor / 3 \t: " + (valor = valor / 3));
        System.out.println("valor = valor % 3 \t: " + (valor = valor % 3));
    }

}
