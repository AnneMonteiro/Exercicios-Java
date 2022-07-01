package com.company.javacore.testando.classeTest;

import com.company.javacore.testando.classe.Professor;

public class ProfessorTest {
    public static void main(String[] args) {

        Professor prof = new Professor();

        prof.cpf = "111.222.333-44";
        prof.nome = "Manuel";
        prof.rg = "20201-2";
        prof.matricula = "1121";

        Professor prof2 = new Professor();

        prof2.cpf = "555.667.777-88";
        prof2.nome = "Luisa";
        prof2.rg = "13450-9";
        prof2.matricula = "1122";

//        prof = prof2;

        System.out.println(prof.cpf);
        System.out.println(prof.nome);
        System.out.println(prof.rg);
        System.out.println(prof.matricula);
        System.out.println("---------------------------------");
        System.out.println(prof2.cpf);
        System.out.println(prof2.nome);
        System.out.println(prof2.rg);
        System.out.println(prof2.matricula);

    }
}
