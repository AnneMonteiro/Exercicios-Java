package com.company.javacore.sobrecargaConstrutores.test;

import com.company.javacore.metodos.classe.Estudante;
import com.company.javacore.sobrecargaConstrutores.classes.Estudantes;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudantes estudante = new Estudantes("Karen","12345", new double[] {5,7,9}, "13/04/2021");

        estudante.imprime();
    }


}
