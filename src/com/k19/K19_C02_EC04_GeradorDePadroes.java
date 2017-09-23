/**
 * Cap 02 - Exe Compl 02 - Fibonacci
 * set 23, 2017 - Learning Java-Netbeans
 * sergio.torres@outlook.com
 */
package com.k19;

import java.util.Scanner;

public class K19_C02_EC04_GeradorDePadroes {

    public static void main(String[] args) {

        int opc = 1;
        System.out.println("Escolha uma opcao de 1 a 5 e 0 para sair!");
        while (opc != 0) {
            Scanner scanner = new Scanner(System.in);
            String valorTela = scanner.nextLine();
            opc = Integer.parseInt(valorTela);

            if (opc == 1) {
                System.out.println("Opcao 1");
            } else if (opc == 2) {
                System.out.println("Opcao 2");
            } else if (opc == 3) {
                System.out.println("Opcao 3");
            } else if (opc == 4) {
                System.out.println("Opcao 4");
            } else if (opc == 5) {
                System.out.println("Opcao 5");
            }
        }
        System.out.println("Voce optou por sair!");
    }

}
