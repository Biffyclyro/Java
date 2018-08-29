package model;

import java.util.ArrayList;

public class Area {
    private String nome;
    private ArrayList<Rota> entregas;
    private Funcionario colaborador;
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setEntrega(ArrayList<Rota> rota){
        this.entregas=rota;
    }
    public void setFuncionario(Funcionario colaborador){
        this.colaborador=colaborador;
    }
    public String getNome(){
        return nome;
    }
    public ArrayList<Rota> getEntrega(){
        return entregas;
    }
    public Funcionario getColaborador(){
        return colaborador;
    }
}
