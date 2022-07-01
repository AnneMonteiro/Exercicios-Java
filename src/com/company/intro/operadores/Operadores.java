package com.company.intro.operadores;

public class Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        int soma = numero1+numero2;
        int numeroInteiro = 20;
        long numeroLong = 200000L;
        double numeroDouble = 10d;
        float numeroFloat = 20f;

        numeroFloat = (float) numeroDouble;

        int resto = 20%2;
        System.out.println("Resto da divisao " + resto);
        System.out.println(numeroDouble);

        System.out.println("A soma e " +(numero1+numero2));
        System.out.println("A divisao e " +(numero2/numero1));
        System.out.println("A subtracao e " +(numero2-numero1));
        System.out.println("A multiplicacao e " +(numero1*numero2));
    }
}
