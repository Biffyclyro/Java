package model;

public class Cliente {
    
    private String nome;
    private String rua;
    private int numero;
    private String cpf;
    
    /*visibilidade 
    tipo de retorno
    nome do método(com ou sem atributos)
    corpo do método(bloco de código)
    */
    public void setNome(String nome){
        this.nome = nome;        
    }
    //this usado para referenciar o valor da variável no objeto
    public void setRua(String rua){
        this.rua = rua;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    // get sem parâmetro
    public String getNome(){
        return nome;
    }
    
    public String getRua(){
        return rua;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public Cliente(){
    }
    
    public Cliente(String cpf){
        System.out.println("Criando cliente...");
        setCpf(cpf);
    }
    
}
