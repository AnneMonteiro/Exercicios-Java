package com.company.javacore.metodos.classe;

public class Estudante {

    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public void print(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        if(this.notas != null){
        for(double nota : this.notas){
            System.out.println(nota+" ");
        }
        }
    }

    public void tirarMedia(){
        if(this.notas == null){
            System.out.println("Esse aluno não possui notas");
            return;
        }
        double media = 0;
        for(double nota : this.notas){
            media += nota;
        }
        media = media/this.notas.length;

//        if(media > 6) {
//            System.out.println("Aprovado");
//            return;
//        }
//        System.out.println("Reprovado");
//    }

    if(media > 6) {
        this.aprovado = true;
        System.out.println("A media é: " + media + " situaçao: Aprovado");
    } else{
        this.aprovado = false;
        System.out.println("A media é: " + media + " situaçao: Reprovado");
    }
}
}
