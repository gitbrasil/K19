/**
 * Cap 02 - Cod 11 - Operadores Atribuicao
 * set 22, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.k19;

public class K19_C02_C11_OperAtrib {

    public static void main(String[] args) {

        int valor = 1;

        System.out.println("Operadores de Atribuicao\n");
        //        
        System.out.println("• Simples \t\t: int valor = 1 \t: " + valor);
        //
        System.out.println("• Incremental += \t: valor += 2 \t\t: " + (valor += 2));
        //
        System.out.println("• Decremental -= \t: valor -= 1 \t\t: " + (valor -= 1));
        //
        System.out.println("• Multiplicativa *= \t: valor *= 6 \t\t: " + (valor *= 6));
        //
        System.out.println("• Divisoria /= \t\t: valor /= 3 \t\t: " + (valor /= 3));
        //
        System.out.println("• Modular %= \t\t: valor %= 3 \t\t: " + (valor %= 3));
    }

}
