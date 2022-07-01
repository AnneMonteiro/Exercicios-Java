package com.company.javacore.metodos.classeTest;

import com.company.javacore.metodos.classe.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();

        estudante.setNome("William");
        estudante.setIdade(27);
        estudante.setNotas(new double[]{2,4,1});

        estudante.print();
        estudante.tirarMedia();

        System.out.println("Aprovado?"+estudante.isAprovado());
    }


}
