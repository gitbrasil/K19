/**
 * Printf
 * Aug 30, 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */
package com.k19;

public class K19_E06_Printf {

    public static void main(String[] args) {

        // variable declaration
        int numeroDaConta;
        double precoDoProduto;

        // obtain value
        numeroDaConta = 1000;
        precoDoProduto = 100.20;

        // display message
        System.out.println("Conta: " + numeroDaConta);
        /*
		 * %.2f para  2 casas decimais
		 * com o printf
         */
        System.out.printf("Valor do produto: %.2f", precoDoProduto);
        System.out.println("");
    }

}
