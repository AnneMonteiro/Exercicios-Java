package com.company.javacore.modificadorEstatico.classesTest;

import com.company.javacore.modificadorEstatico.classes.Cliente;

public class ClienteTest {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        System.out.println("Exibindo quantidade de parcelas possiveis");

        for(int parcela : cliente.getParcelas()){
            System.out.println(parcela + " ");
        }
    }
}
