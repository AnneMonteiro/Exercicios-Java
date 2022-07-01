package com.company.javacore.metodos.classeTest;

import com.company.javacore.metodos.classe.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        calc.somaDoisNumeros();

        calc.substraiDoisNumeros();

        calc.multiplicaDoisNumeros(55.5,5);

        System.out.println("Divisao de dois numeros");

        double result = calc.divideDoisNumeros(20,0);

        System.out.println(result);

        System.out.println("Imprimindo dois numeros divididos");

        calc.imprimeDoisNumerosDivididos(20,5);

        System.out.println("Continuando a executar");

        int[] numeros = {1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5);
    }
}
