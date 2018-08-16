
package modelo;


//visibilidade public
public class Canetao {
    String descricao = "Canetão da secretaria";
    float preco = 1.30f;
    String marca = "BIC";
    String cor = "vermelho";
    
    String escrever(){
        return "Eu sou um canetão" ;
    }
    
    String apresentacao(){
        return descricao + "Preço: " + preco + " Marca: " + marca + " Cor: " + cor;
    }
    
    
    public static void main(String args[]){
       Canetao p1 = new Canetao();
       System.out.println(p1.cor);
       System.out.println(p1.apresentacao());
    }
    
}
