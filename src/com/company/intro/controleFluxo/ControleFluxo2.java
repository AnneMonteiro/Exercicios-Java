package com.company.intro.controleFluxo;

public class ControleFluxo2 {
    public static void main(String[] args) {

        int idade = 20;
        String status;
        boolean ok = true;

//        status = (ok = false) ? "não adulto" : "adulto" ;
//        System.out.println(status);

//        status = idade < 18 ? "não adulto" : "adulto" ;
//        System.out.println(status);

        if(idade < 18){
            status = "adulto";
        }else{
            status = "não adulto";
        }
        System.out.println(status);
    }
}
