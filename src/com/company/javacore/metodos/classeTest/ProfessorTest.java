package com.company.javacore.metodos.classeTest;

import com.company.javacore.metodos.classe.Professor;

public class ProfessorTest {
    public static void main(String[] args) {

        Professor prof = new Professor();

        prof.cpf = "111.222.333-44";
        prof.nome = "Manuel";
        prof.rg = "20201-2";
        prof.matricula = "1121";

        Professor prof2 = new Professor();

        prof2.cpf = "111.222.333-41";
        prof2.nome = "Marcos";
        prof2.rg = "20202-2";
        prof2.matricula = "1122";

        prof.imprime();
        prof2.imprime();

//        prof.imprime(prof2);

    }
}
