
package utilidades;
import modelo.CanetaoV2;

public class Teste {
    public static void main(String args[]){
        
        CanetaoV2 v2 = new CanetaoV2();
        v2.cor = "preto ";
        v2.descricao = "Canetão novo ";
        v2.marca = "BIC ";
        v2.preco = 2.30f;
        
        System.out.println(v2.apresentacao());
        
        CanetaoV2 v21 = new CanetaoV2();
        v21.cor = "azul ";
        v21.descricao = "Caneta azul ";
        v21.marca = "BIC ";
        v21.preco = 0.55f;
        
        System.out.println(v21.apresentacao());
        
        v21 = null;
        try{
            
        }catch(NullPointerException ex){
            
        }
        
    }
}
