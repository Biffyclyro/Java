package utilities;

import java.util.ArrayList;
import model.Area;
import model.Cliente;
import model.Funcionario;
import model.Rota;

public class Test {
    public static void main(String args[]){
        Cliente c1 = new Cliente();
        c1.setNome("Fulano");
        c1.setEnd("Rua Silva Jardim");
        c1.setLng("-29.683956");
        c1.setLat("-53.812466");
            
            
        Cliente c2 = new Cliente();
        c1.setNome("Siclano");
        c1.setEnd("Rua Conde de Porto Alegre");
        c1.setLng("-29.684804");
        c1.setLat("-53.815288");
            
            
        Cliente c3 = new Cliente();
        c1.setNome("Beltrano");
        c1.setEnd("Rua dos Andradas");
        c1.setLng("-29.686034");
        c1.setLat(" -53.815792");

            
        Cliente c4 = new Cliente();
        c1.setNome("João");
        c1.setEnd("Barão do triunfo");
        c1.setLng("-29.687001");
        c1.setLat("-53.816238");
            
            
            
        Funcionario f1 = new Funcionario();
        f1.setNome("Onartleb");
        f1.setSalario(1500.00f);
        
        Funcionario f2 = new Funcionario();
        f1.setNome("Onalcis");
        f1.setSalario(1500.00f);
        
        
        ArrayList<Cliente> clientes1 = new ArrayList<>();
        clientes1.add(c1);
        clientes1.add(c2);
        
        ArrayList<Cliente> clientes2 = new ArrayList<>();
        clientes2.add(c3);
        clientes2.add(c4);       
        
        
        Rota r1 = new Rota();
        r1.setNome("Rota x");
        r1.setFuncionario(f1);
        r1.setClientes(clientes1);
        
        
        Rota r2 = new Rota();
        r1.setNome("Rota y");
        r1.setFuncionario(f2);
        r1.setClientes(clientes2);
        
        ArrayList<Rota> rotas  = new ArrayList<>();
        rotas.add(r1);
        rotas.add(r2);
        
        Area a1 = new Area();
        a1.setNome("Cetro");
        a1.setFuncionario(f2);
        a1.setEntrega(rotas);
        
        
        
        
        
        
    }
}
