package teste;

import java.util.ArrayList;
import model.Assador;
import model.Churrasco;
import model.Pessoa;
import model.Veiculo;

public class Teste {

    public static void main(String args[]){
        
Veiculo a1 = 
        new Veiculo("Folskvagem", "Fusca 1500");
Pessoa p = new Pessoa("Nicanor", 55.99f);
       p.setAuto(a1);

Pessoa p1 = new Pessoa("Joceldo", 95);
Pessoa p2 = new Pessoa("Niko", 90);
Pessoa p3 = new Pessoa("Eva", 98);

ArrayList<Pessoa> partChurras = 
        new ArrayList<>();
partChurras.add(p);
partChurras.add(p1);
partChurras.add(p2);
partChurras.add(p3);

Churrasco c1 = 
        new Churrasco(
                "UFSM", 
                "Churra Galera Disp OO", 
                "2018/2", partChurras);

Assador ass = new Assador("Assador violento", 88);
c1.setAssador(ass);
ass.setPessoa(p);
c1.servirChurras();

    }
    
}
