/**
 * Cap 01 - Cod 11 - Variaveis - Operadores Atribuicao
 *
 * Aug 30, 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.k19;

public class K19_C01_C11_OperAtrib {

    public static void main(String[] args) {

        int valor = 1;
        System.out.println("• Simples =\n");
        System.out.println("int valor = 1" + valor);
        //
        System.out.println("• Incremental +=");
        System.out.println("valor += 2 " + (valor += 2));
        //
        System.out.println("• Decremental -=");
        System.out.println("valor -= 1 " + (valor -= 1));
        //
        System.out.println("• Multiplicativa *=");
        System.out.println("valor *= 6 " + (valor *= 6));
        //
        System.out.println("• Divisoria /=");
        System.out.println("valor /= 3 " + (valor /= 3));
        //
        System.out.println("• Modular %=");
        System.out.println("valor %= 3 " + (valor %= 3));
    }

}
