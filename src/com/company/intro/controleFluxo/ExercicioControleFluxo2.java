package com.company.intro.controleFluxo;

public class ExercicioControleFluxo2 {
    public static void main(String[] args) {

        //Crie um switch que dado um valor de 1 ao 7
        //Considerando 1 domingo imprima se é dia util ou final de semana

        byte dia = 1;

        switch(dia){
            case 1:
            case 7:
                System.out.println("final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
        }
    }
}
