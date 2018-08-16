package model;

public class Cliente {
    public String nome;
    public String rua;
    public int numero;
    public String cpf;    
    
    public Boolean comprar(int x){
        if(x == 1){
            return true;
        }else{
            return false;
        }
        
    }
    
    public String apresentacao(){
        return "Nome: " + nome + " Rua: " + rua + " Numero: " + numero + " CPF: " + cpf;
    }
}
