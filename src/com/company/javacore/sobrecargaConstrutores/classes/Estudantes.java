package com.company.javacore.sobrecargaConstrutores.classes;

public class Estudantes {
    private String nome;
    private String matricula;
    private double[] notas;
    private String dataMatricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Estudantes(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public Estudantes() {
        System.out.println("Construtor default");
    }

    public Estudantes(String nome, String matricula, double[] notas, String dataMatricula) {
        this(nome, matricula, notas);
        this.dataMatricula = dataMatricula;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.matricula);
        for(double nota : notas){
            System.out.println(nota + " ");
        }
    }
}
