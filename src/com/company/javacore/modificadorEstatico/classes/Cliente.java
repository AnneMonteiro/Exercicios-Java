package com.company.javacore.modificadorEstatico.classes;

public class Cliente {

    private static int[] parcelas = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização");
        for(int i=1; i<=100; i++) {
            parcelas[i - 1] = i;
        }
    }

    public static int[] getParcelas() {
        return parcelas;
    }

    public static void setParcelas(int[] parcelas) {
        Cliente.parcelas = parcelas;
    }

    public Cliente() {
//        System.out.println("Dentro do Construtor");
//        for(int parcela : this.parcelas){
//            System.out.println(parcela + " ");
        }
    }

