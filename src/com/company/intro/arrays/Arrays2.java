package com.company.intro.arrays;

public class Arrays2 {
    public static void main(String[] args) {

        //byte, short, int, long, float, double = 0
        //char '\u0000'
        //boolean false;
        //reference null

        String[] nomes = new String[4];

        nomes[0] = "Luis";
        nomes[1] = "Maria";
        nomes[2] = "Jose";
        nomes[3] = "Pedro";

//        System.out.println(nomes.length);
//
//        for(int i=0; i<4; i++){
//        System.out.println(nomes[i]);
//        }

        for(int i=0; i< nomes.length; i++){
            System.out.println((i + 1)+ " nome: "+nomes[i]);
        }

    }
}
