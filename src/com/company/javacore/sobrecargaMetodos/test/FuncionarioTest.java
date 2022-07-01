package com.company.javacore.sobrecargaMetodos.test;

import com.company.javacore.sobrecargaMetodos.classes.Funcionario;

public class FuncionarioTest {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Xica da Silva", "013.153.919-10",4500, "1234-5678");
        Funcionario funcionario2 = new Funcionario();

//        funcionario.setNome("Xica da Silva");
//        funcionario.setCpf("013.153.919-10");
//        funcionario.setSalario(4500);

//        funcionario.init("Xica da Silva", "013.153.919-10",4500, "1234-5678");

        funcionario.imprime();
        funcionario2.imprime();
    }
}
