package org.example;

public class Usuario {
    protected String nomeCompleto;
    protected int idade;
    protected String nomeDaMae;
    protected String nomeDoPai;

    public Usuario(String nomeCompleto, int idade, String nomeDaMae, String nomeDoPai) {
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
        this.nomeDaMae = nomeDaMae;
        this.nomeDoPai = nomeDoPai;
    }

    @Override
    public String toString() {
        return "Nome: " + nomeCompleto + "\nIdade: " + idade + "\nNomeDaMae: " + nomeDaMae + "\nNomeDoPai: " + nomeDoPai;
    }
}