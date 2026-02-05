package atvPOO.model;

public class Pet {
    private String nome;
    private String tipo;
    private int idade;
    private double peso;
    private String nome_do_dono;
    private boolean estaVacinado;

    public Pet(){
    }

    public Pet(String nome, String tipo, int idade, double peso, String nome_do_dono, boolean estVacinado){
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
        this.peso = peso;
        this.nome_do_dono = nome_do_dono;
        this.estaVacinado = estaVacinado;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int Idade){
        this.idade = idade;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public String getNome_do_dono(){
        return nome_do_dono;
    }

    public void setNome_do_dono(String nome_do_dono){
        this.nome_do_dono = nome_do_dono;
    }

    public boolean isEstaVacinado(){
        return estaVacinado;
    }

    public void setEstaVacinado(boolean estaVacinado){
        this.estaVacinado = estaVacinado;
    }

    public void apresentar(){

    }


}







































