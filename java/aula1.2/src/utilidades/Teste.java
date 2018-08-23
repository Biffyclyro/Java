package utilities;
import model.Clientes;
import model.Rota;

public class Test {
    public static void main(String args[]){
        Clientes c1 = new Clientes();
        c1.nome = "Marcos";
        c1.cpf = "02133023";
        c1.numero = 99999999;
        c1.rua = "Baura";
        
        
        //segundo cliente
        Clientes c2 = new Clientes();
        c2.nome = "Marecelo";
        c2.cpf = "032312940";
        c2.numero = 92913923;
        c2.rua = "Cadju";
        
        
        Rota baura = new Rota();
        baura.lista.add(c1);
        baura.lista.add(c2);
        
        System.out.println(baura.lista);
    }
}
