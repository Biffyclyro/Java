package model;

public class Assador {
    private String nome;
    private int habilidade;

    public Assador(String nome, int habilidade) {
        this.nome = nome;
        this.habilidade = habilidade;
    }

    public Assador() {
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    }
    
    
}
