package model;

public class Funcionario {
    private String nome;
    private float salario;
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setSalario(float salario){
        this.salario=salario;
    }
    public String getNome(){
        return nome;
    }
    public float getSalario(){
        return salario;
    }
}
