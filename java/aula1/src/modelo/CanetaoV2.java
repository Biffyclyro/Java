package modelo;

public class CanetaoV2 {
    public String descricao;
    public float preco;
    public String marca;
    public String cor;
    
    
    private String escrever(){
        return "Eu sou um canetão" ;
    }
    
    public String apresentacao(){
        return descricao + "Preço: " + preco + " Marca: " + marca + " Cor: " + cor;
    } 
}
