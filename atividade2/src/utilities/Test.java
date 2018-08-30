package utilities;


import model.Assador;
import model.Churrasco;
import model.Pessoa;
import model.Veiculo;

public class Test {
    public static void main(String args[]){
        Veiculo v1 = new Veiculo("Tesla", "Tesla Motors");
        Veiculo v2 = new Veiculo("Uno", "Fiat");
        
        Assador ass1 = new Assador("Fulano", 7);
        
        Pessoa p1 = new Pessoa("Siclano", 2.5f);
        Pessoa p2 = new Pessoa("Beltrano", 5.5f);
        
        Churrasco churras = new Churrasco("Rua Conceição Walthier", ass1);
        
        churras.entrarParticipantes(p1);
        churras.entrarParticipantes(p2);
        
        
        
    }
    
}
