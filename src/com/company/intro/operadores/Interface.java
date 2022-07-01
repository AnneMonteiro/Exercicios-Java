package com.company.intro.operadores;

import java.util.Scanner;

public interface Interface {
    public static void main(String[] args) {
        System.out.println("Escolha uma das seguintes opções");
        System.out.println("   Digite 1 para consultar seu saldo");
        System.out.println("   Digite 2 para deposito");
        System.out.println("   Digite 3 para saque");
        System.out.println("   Digite 4 para saber seu extrato");

        Scanner scanner = new Scanner(System.in);

        int opçãoSelecionada = scanner.nextInt();

        System.out.println("A opção que você escolheu é:  " + opçãoSelecionada);
    }
}
