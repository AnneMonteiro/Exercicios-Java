package com.company.javacore.metodos.classe;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(5+5);
    }

    public void substraiDoisNumeros(){
        System.out.println(5-5);
    }

    public void multiplicaDoisNumeros(double num1, int num2) {
        System.out.println(num1*num2);
    }

    public double divideDoisNumeros(double num1, double num2){
//        double resultado = num1 / num2;
//        return resultado;
        if(num2 != 0){
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDoisNumerosDivididos(double num1, double num2){
        if (num2 != 0) {
            System.out.println(num1/num2);
//            return;       -O return serve como o break nos metodos VOID, ao usa-lo devemos excluir a palavra ELSE.
        }else{
            System.out.println("Não é possivel dividir por zero");
        }
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
    }

    public void somaArray (int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs (int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
