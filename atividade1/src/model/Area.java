package model;

import java.util.ArrayList;

public class Area {
    private String nome;
    private ArrayList<Rota> rota;
    private Funcionario colaborador;
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setRota(ArrayList<Rota> rota){
        this.rota=rota;
    }
    public void setFuncionario(Funcionario colaborador){
        this.colaborador=colaborador;
    }
    public String getNome(){
        return nome;
    }
    public ArrayList<Rota> getRota(){
        return rota;
    }
    public Funcionario getColaborador(){
        return colaborador;
    }
}
