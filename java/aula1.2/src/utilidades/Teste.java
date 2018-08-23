package visao;
import java.util.ArrayList;
import model.Cliente;
import model.Rota;

public class Test {
    public static void main(String args[]){
        Cliente cli = new Cliente();
        cli.setNome("Fulano");
        cli.setRua("Bla bla bla");
        cli.setNumero(99999999);
        cli.setCpf("32139213");
        
        
        
        Cliente cli1 = new Cliente();
        cli1.setNome("Beltrano");
        cli1.setRua("Bla bla bla");
        cli1.setNumero(9312434);
        cli1.setCpf("32134324324");
        
        ArrayList<Cliente>clientes = new ArrayList<>();
        clientes.add(cli);
        clientes.add(cli1);
        
        
        
        Rota rota = new Rota();
        rota.setNome("Camobi - centro");
        rota.setPontosEntrega(clientes);
        imprimeRota(rota);
        
        }
    
    private static void imprimeRota(Rota rota){
            System.out.println("Nome: "+ rota.getNome());
            System.out.println("Pontos de Entrega******");
            
            for (int i = 0; i < rota.getPontosEntrega().size(); i++){
                Cliente c = rota.getPontosEntrega().get(i);
                System.out.println("Nome: "+ c.getNome());
            }
        
        //System.out.println("Nome do cliente: " + cli.getNome()+ " " + cli.getRua()+ " " + cli.getNumero()+ " " + cli.getCpf());
    }
    
}
