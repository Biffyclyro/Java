package model;

public class Pessoa {
    private String nome;
    private float nivelFome;

    public Pessoa(String nome, float nivelFome) {
        this.nome = nome;
        this.nivelFome = nivelFome;
    }
    
    public Pessoa(){        
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNivelFome() {
        return nivelFome;
    }

    public void setNivelFome(float nivelFome) {
        this.nivelFome = nivelFome;
    }
    
}
