package model;

import java.util.ArrayList;

public class Rota {
    private String nome;
    private ArrayList<Cliente> pontosEntrega;
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    
    public void setPontosEntrega(ArrayList<Cliente> clientes){
        this.pontosEntrega = clientes;
    }
    
    public ArrayList<Cliente> getPontosEntrega(){
        return pontosEntrega;
    }
    
    public String getNome(){
        return nome;
    }
}
