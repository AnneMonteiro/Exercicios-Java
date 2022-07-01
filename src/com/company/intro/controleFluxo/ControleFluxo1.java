package com.company.intro.controleFluxo;

public class ControleFluxo1 {
    public static void main(String[] args) {

//        if(true)
//           System.out.println("entrou no if true");
//
//        if(false){
//            System.out.println("entrou no if");
//        }

        int idade = 15;
        float salario = 2000;
        boolean c = false;
        String categoria;

//        if (idade >= 18){
//            System.out.println("entrou no clube");
//        }else{
//            System.out.println("não pode entrar");
//        }

//        ES NECESARIO INICIAR LA VARIABLE

        if(idade < 15){
            categoria = "infantil";
        }else if(idade >= 15 && idade < 18){
            categoria = "juvenil";;
        }else{
            categoria = "adulto";;
        }
        System.out.println(categoria);
        }
    }
