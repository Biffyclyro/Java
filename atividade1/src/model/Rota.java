package model;

import java.util.ArrayList;

public class Rota {
    private String nome;
    private ArrayList<Cliente> cliente;
    private Funcionario funcionario;
            
            
     public void setNome(String nome){
         this.nome=nome;
     }
     public void setClientes(ArrayList<Cliente> cliente){
         this.cliente=cliente;
     }
     public void setFuncionario(Funcionario funcionario){
         this.funcionario=funcionario;
     }
     public String getNome(){
         return nome;
     }
     public ArrayList<Cliente> getCliente(){
         return cliente;
     }
     public Funcionario getFuncionario(){
         return funcionario;
     }
}
