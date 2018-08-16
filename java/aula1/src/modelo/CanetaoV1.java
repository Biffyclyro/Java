package modelo;

public class CanetaoV1 {
    String descricao = "Canetão da secretaria";
    float preco = 1.30f;
    String marca = "BIC";
    String cor = "vermelho";
    
    String escrever(){
        return "Eu sou um canetão" ;
    }
    
    public String apresentacao(){
        return descricao + "Preço: " + preco + " Marca: " + marca + " Cor: " + cor;
    }       
   
}
