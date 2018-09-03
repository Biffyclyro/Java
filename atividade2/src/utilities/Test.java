package utilities;


import java.util.ArrayList;
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
        p1.setCarro(v2);
        Pessoa p2 = new Pessoa("Beltrano", 5.5f);
        p2.setCarro(v1);
        
        Churrasco churras = new Churrasco("Rua Conceição Walthier", ass1);
        
        churras.entrarParticipantes(p1);
        churras.entrarParticipantes(p2);
        
      //  imprimeChurras2(churras);
       
      //  imprimeChurras(churras);
        conviteChurras(churras);
        
        
    }
    
    private static void imprimeChurras(Churrasco x){
        for(int i = 0; i < x.getParticipante().size();i++){
            System.out.println("Nome: "+x.getParticipante().get(i).getNome());
            System.out.println("Veículo: " + x.getParticipante().get(i).getCarro().getNome());
            System.out.println("Nível de fome: " + x.getParticipante().get(i).getNivelFome());
            System.out.println("");
        }
    }
    
    private static void imprimeChurras2(Churrasco x){
        x.getParticipante().forEach(participante-> System.out.println("Nome: "+participante.getNome()));
        
      /*for(Pessoa participante :x.getParticipante()){        
            System.out.println(participante.getNome());            
        } */
    }
    
    private static void conviteChurras(Churrasco x){
        System.out.println("Churrasco no endereço: "+x.getEnd());
        System.out.println("Com o assador: "+x.getAssador().getNome());
        System.out.println("Que tem skills de churrasco: "+ x.getAssador().getHabilidade());
        System.out.println("Convidados");
        imprimeChurras(x);
    }
    
}
